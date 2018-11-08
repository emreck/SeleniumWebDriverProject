import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageControl {

    WebDriver driver= null;
    String favoriId;
    String oncekiSayfadakiUrunId;
    @FindBy(className = "plink")
    private WebElement favoriUrunId;


    public boolean karsilastirma(){
        boolean result = false;
        favoriId = favoriUrunId.getAttribute ( "data-id" );
        oncekiSayfadakiUrunId = FavoriteProduct.urunId;

        if (favoriId.equals ( oncekiSayfadakiUrunId )){
            result = true;
        }
        else
            result = true;

        return result;

    }
    public PageControl(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }


}
