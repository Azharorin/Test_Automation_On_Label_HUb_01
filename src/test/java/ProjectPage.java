import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProjectPage {


   // @FindBy(xpath ="//*[@id=\"root\"]/section/main/div[2]/div[2]/section/div/div[1]/div[1]/div/button")
    //1
   //WebElement projectText;
    @FindBy(xpath = "//button[normalize-space()='Create Project']")
    WebElement createProjectBtn;
    //1
    @FindBy(name = "name")
    WebElement nameText;
    @FindBy(name="description")
    WebElement desTxt;
    @FindBy(id = "1")
    WebElement nerTag;
    @FindBy(css = "div[class='tw-flex tw-flex-wrap tw-gap-2'] div:nth-child(1) button:nth-child(1) div:nth-child(1)")
    WebElement nertagSelect;
    @FindBy(css="button")
   List<WebElement> createBtn;

    public ProjectPage (WebDriver driver){
        PageFactory.initElements(driver
                ,this);

    }
    public void doAddpro(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
       // WebElement dropdownOption = wait.until(ExpectedConditions.elementToBeClickable(projectText.get(1)));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tw-flex tw-gap-8 tw-flex-wrap']//div[1]//div[1]//button[1]")));
        element.click();

        //projectText.click();
        createProjectBtn.click();
        nameText.sendKeys("azharara");
        desTxt.sendKeys("this is a test demo project");
        nerTag.click();
        nertagSelect.click();
        //div[@class='tw-px-14 tw-flex tw-justify-start tw-border-0 modal-footer']
     //  WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tw-px-14 tw-flex tw-justify-start tw-border-0 modal-footer']")));

        //createBtn.click();
      //  element1.click();
     //JavascriptExecutor js= (JavascriptExecutor) driver;
     // js.executeScript("window.scrollBy(0,documents.body.scrollHeight)");
    // js.executeScript("window.scrollBy(600,document.body.scrollHeight)");
       //
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tw-px-14 tw-flex tw-justify-start tw-border-0 modal-footer']"))).click();

     ;
        //createBtn.get(1).click();



    }


}
