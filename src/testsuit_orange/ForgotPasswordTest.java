package testsuit_orange;

import orangehrmlive.BaseTestO;
import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTestO { // class extended with base  class
    String baseurl = "https://opensource-demo.orangehrmlive.com/"; // display url

    @Before     //  opening browser
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        WebElement ForgotPassword= driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")); // x path for forget password field
        ForgotPassword.click();
    }

    @After
    public void tearDown() { // closing browser
        closeBrowser();
    }
}
