import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCheck {


    WebDriver driver= null;
    String karsistirilacakKelime = "Samsung";
    String aranan;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/section[2]/div[1]/div[1]/h1")
    private WebElement arananKelime;

    // //*[@id="contentListing"]/div/div/div[2]/section[2]/div[1]/div[1]/h1
  //  /html/body/div[1]/div[2]/div/div/div[2]/section[2]/div[1]/div[1]/h1

    public boolean karsilastimaKontrol(){

        boolean result = false;
        aranan = arananKelime.getText ();
        if (karsistirilacakKelime.equals ( aranan )) {
            result = true;
        }
        else
        result=false;

        return result;
    }


    public SearchCheck(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements (driver,this  );
    }


}
