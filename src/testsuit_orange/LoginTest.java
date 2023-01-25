package testsuit_orange;

import orangehrmlive.BaseTestO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestO {  // class name
    String baseurl = "https://opensource-demo.orangehrmlive.com/"; // display url

    @Before  /// starting brpwser
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        WebElement username = driver.findElement(By.xpath("//input[@name='username']")); // x path for username
        username.sendKeys("Admin"); // enter username

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));// x path for password
        username.sendKeys("admin123"); // enter password

        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']")); // click on login butto
        loginbutton.click();
    }
    @After
    public void tearDown() {   // closing browser
        closeBrowser();
    }
}


