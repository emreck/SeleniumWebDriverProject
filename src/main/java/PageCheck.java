import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;

public class PageCheck {

    WebDriver driver = null;
    String bulunanSayfaDegeri;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/a[2]")
    private WebElement sayfayaTikla;

    @FindBy(className = "currentPage")
    private WebElement arananSayfa;


    public void sayfayiBul(){

        sayfayaTikla.click ();
    }

    public boolean sayfaOnay(){
        boolean result = false;
        bulunanSayfaDegeri = arananSayfa.getAttribute ( "value" );

        if (bulunanSayfaDegeri.equals ( "2" )) {
            result = true;
        }
        else
            result=false;

        return result;
    }

    public PageCheck(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements (driver,this  );
    }




}
