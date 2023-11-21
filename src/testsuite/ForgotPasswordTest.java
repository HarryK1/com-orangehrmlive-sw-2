package testsuite;
/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfull y
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the Forgot your password link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //verify the text Reset password
        String expectedDisplay = "Reset Password";
        String actualDisplay = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
