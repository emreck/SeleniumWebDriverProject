import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver =null;


    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "loginButton")
    private WebElement loginBtn;

    @FindBy(className = "btnSignIn")
    private WebElement signIn;

    public void signButton(){
        signIn.click ();
    }

    public void setMail(String mailData){
       this.email.sendKeys ( mailData );
    }

    public void setPassword(String passwordData){
       this.password.sendKeys ( passwordData );
    }

    public Search loginButton(){
        loginBtn.click ();

        return new Search (this.driver);

    }

    public Login(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements (driver,this  );
    }




}
