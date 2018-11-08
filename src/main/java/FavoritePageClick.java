import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritePageClick {

    WebDriver driver = null;

    @FindBy(xpath = "//div[2]/div[2]/div[2]/div/a")
    private WebElement hesabımTikla;

    @FindBy(xpath = "//div[2]/ul/li[6]/a")
    private WebElement istekListem;

    @FindBy(xpath = "//h4")
    private WebElement favorilerim;

    public void sayfaClick(){
        hesabımTikla.click ();
        istekListem.click ();
        favorilerim.click ();
    }

    public FavoritePageClick(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }

}
