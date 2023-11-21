package testsuite;
/**
 * 3. Write down the following test into ‘LoginTest’ class 1. userSholdLoginSuccessfullyWithValidCredentials * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //enter Admin username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //enter admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        //verify Dashboard text is displayed
        String expectedDisplay = "Dashboard";
        String actualDisplay = driver.findElement(By.xpath("//a[@href='/web/index.php/dashboard/index']")).getText();
        Assert.assertEquals("Dashboard",expectedDisplay,actualDisplay);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
