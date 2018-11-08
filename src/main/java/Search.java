import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    WebDriver driver = null;

    String aranacakKelime ="Samsung";

    @FindBy(id = "searchData")
    private WebElement searchdata;

    @FindBy(className = "searchBtn")
    private WebElement searchButton;


    public void kelimeGirisi(){
        searchdata.sendKeys ( "Samsung" );

    }

    public SearchCheck aramaYap() {

        searchButton.click ();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        return new SearchCheck ( this.driver );
    }



    public  Search(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements ( driver,this );
    }






}
