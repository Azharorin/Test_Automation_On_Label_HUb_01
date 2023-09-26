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
    //@FindBy(xpath="//div[@class='tw-px-14 tw-flex tw-justify-start tw-border-0 modal-footer']//text()")
   WebElement createBtn;

    public ProjectPage (WebDriver driver){
        PageFactory.initElements(driver
                ,this);

    }
    public void doAddpro(WebDriver driver) throws InterruptedException {
        Thread.sleep(10);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement dropdownOption = wait.until(ExpectedConditions.elementToBeClickable(projectText.get(1)));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tw-flex tw-gap-8 tw-flex-wrap']//div[1]//div[1]//button[1]")));
        element.click();

        //projectText.click();
        createProjectBtn.click();
        nameText.sendKeys("Project NER11");
        desTxt.sendKeys("This is a test demo project FOR NER1");
        nerTag.click();
        nertagSelect.click();

      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[3]/button"))).click();

     ;
        //createBtn.click();





    }


}
