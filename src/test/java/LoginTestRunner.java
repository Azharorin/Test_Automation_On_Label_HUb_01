import org.testng.annotations.Test;

public class LoginTestRunner extends SetUp {

    @Test
    public void doLogins() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);

       loginpage.doLogin("admin@gigatech.com","Abc@123");
       ProjectPage pro=new ProjectPage(driver);
       pro.doAddpro(driver);
       //Users user=new Users(driver);
    //   user.doAdduser(driver);






    }
}
