import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnotatorloginPage {

    @FindBy(name = "username")
    WebElement loginElement;

    @FindBy(name = "password")
    WebElement password;


    @FindBy(xpath = "//button[normalize-space()='Sign in']")

    WebElement txtElements;

    public AnnotatorloginPage(WebDriver driver){
        PageFactory.initElements(driver,this
        );

    }

    public void dologina(String username, String passwords){
        loginElement.sendKeys(username);
        password.sendKeys(passwords);
        
    }



}
