import javafx.css.CssMetaData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class LogoutPage {
    //@FindBy(xpath = "/html/body")

   @FindBy(css = "body > div:nth-child(2) > section:nth-child(1) > main:nth-child(1) > div:nth-child(3) > div:nth-child(1) > nav:nth-child(2) > div:nth-child(1) > button:nth-child(1)")
    WebElement logoutstroke;

    @FindBy(xpath="/html/body/div[2]/div/div")
    WebElement logoutBtn;

    public LogoutPage(WebDriver driver){
        PageFactory.initElements(driver,this
        );
    }
    public void doLogout(WebDriver driver) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(logoutstroke));
      logoutstroke.click();

     //   Thread.sleep(10);

       logoutBtn.click();
    }

}
