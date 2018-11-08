import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductRemoval {

    WebDriver driver = null;
    String urunMesaji = "Ürününüz listeden silindi.";

    @FindBy(className = "deleteProFromFavorites")
    private WebElement urunKaldir;

    @FindBy(className = "message")
    private WebElement urunMesaj;

    public void urunuKaldir(){
        urunKaldir.click ();
    }

    public boolean urunMesaj(){
        boolean result = false;
        String messageBoxMesaji = urunMesaj.getText ();
        if (messageBoxMesaji.contains ( urunMesaji ))
            result = true;
        else
            result = false;

        return result;
    }

    public  ProductRemoval(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements ( driver,this );
    }

}
