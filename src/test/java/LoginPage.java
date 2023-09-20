import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {




    @FindBy(name = "username")
    WebElement loginElement;




    @FindBy(name = "password")
    WebElement password;


    @FindBy(xpath = "//button[normalize-space()='Sign In']")

    WebElement txtElements;




        public LoginPage(WebDriver driver){


            PageFactory.initElements(driver,this
            );
        }



       public void doLogin(String username, String Pass) throws InterruptedException {





           loginElement.sendKeys(username);


           password.sendKeys(Pass);


            txtElements.click();

        }

















    }
