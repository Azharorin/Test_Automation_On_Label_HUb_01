import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUp {
   public WebDriver driver;
   //public WebDriver driver;

    @BeforeTest
    public void setup(){


       // WebDriver driver= new FirefoxDriver(); just only for that it returns null pointer exception

        driver= new FirefoxDriver();
       // driver=new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100000));
        driver.get("http://corpus-dev.gigatechltd.com");




    }


//    @AfterTest
//    public void closeDriver() {
//        // Close the driver here if needed
////       if (driver != null) {
////          driver.close();
////            closeDriver();
////        }
//        driver.close();
//    }
}


