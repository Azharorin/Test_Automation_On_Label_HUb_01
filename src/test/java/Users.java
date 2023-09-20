import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Users {


    @FindBy(xpath = "//span[normalize-space()='Users']")
    WebElement txtUsers;
    @FindBy(xpath="//button[normalize-space()='Add User']")
    WebElement addBUTTON;

    @FindBy(xpath = "//button[normalize-space()='Add User']")
    WebElement adduserBtn;
    @FindBy(name = "full_name")
    WebElement fullnameTxt;
    @FindBy(name = "email")
    WebElement emailTxt;
    @FindBy(name="gender")
    WebElement genderDropdown;
    @FindBy(name = "institution_name")
    WebElement institutionnameTxT;
    @FindBy(name="password")
    WebElement passText;
    @FindBy(name="qualification")
    WebElement qualificationTxT;
    @FindBy(name = "mobile")
    WebElement mbileTxt;
    @FindBy(name="role")
    List<WebElement> roleDropdowns;

    @FindBy(css = "button[class='tw-inline-flex tw-items-center tw-justify-center tw-border-transparent tw-rounded tw-text-base tw-font-bold tw-transition-colors focus-visible:outline-none focus-visible:tw-ring-2 focus-visible:tw-ring-ring focus-visible:tw-ring-offset-2 disabled:tw-opacity-90 disabled:tw-pointer-events-none disabled:tw-cursor-not-allowed tw-ring-offset-background tw-bg-blue-500 hover:tw-bg-blue-700 tw-text-white tw-gap-1 h-10 tw-px-4 tw-mx-8 tw-w-full tw-max-w-xs tw-mb-12 tw-py-3']")
    //List<WebElement> addBtn;
    WebElement addBtn;


    public Users(WebDriver driver){
        PageFactory.initElements(driver
        ,this);

    }


    public void doAdduser(WebDriver driver) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(txtUsers).perform();
        txtUsers.click();
        addBUTTON.click();

        fullnameTxt.sendKeys("AZHAR ALAM");
        emailTxt.sendKeys("azhar123@gmail.com");
        adduserBtn.sendKeys("Dhaka");
        genderDropdown.sendKeys(Keys.ARROW_DOWN);
        genderDropdown.sendKeys(Keys.ENTER);
        institutionnameTxT.sendKeys("AIUB");
        qualificationTxT.sendKeys("SOFTWARE ENGINEER");
        passText.sendKeys("Abc@1234");
        mbileTxt.sendKeys("01819098765");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement dropdownOption = wait.until(ExpectedConditions.elementToBeClickable(roleDropdowns.get(1)));
       // dropdownOption.click();

        dropdownOption.sendKeys(Keys.ARROW_DOWN);
        dropdownOption.sendKeys(Keys.ARROW_DOWN);
        dropdownOption.sendKeys(Keys.ARROW_DOWN);

        //roleDropdowns.get(1).sendKeys(Keys.ENTER);
        dropdownOption.sendKeys(Keys.ENTER);
        addBtn.click();






    }








}
