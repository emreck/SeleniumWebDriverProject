import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoriteProduct {

    WebDriver driver = null;
    public static String urunId;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/section[2]/div[2]/ul/li[3]/div/div[2]/span")
    private WebElement arananUrunId;


    public void urunIdsi() {

        urunId = arananUrunId.getAttribute ( "data-productid" );

    }

    public void urunuFavoriEkle() {
        arananUrunId.click ();
    }



    public FavoriteProduct(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }

}
