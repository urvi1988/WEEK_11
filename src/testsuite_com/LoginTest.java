package testsuite_com;

import com_utimateqa.BaseTest_Com;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest_Com {
    String baseurl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement SigninButton = driver.findElement(By.linkText("Sign In")); // click on sign in button
        SigninButton.click();

        WebElement VerifyText = driver.findElement(By.xpath("//h2[@class='page__heading']")); // verify error
        VerifyText.click();
    }

    @Test
    public void verifyTheErrorMessage() {
        WebElement SigninButton = driver.findElement(By.linkText("Sign In")); // clicl on sign in
        SigninButton.click();

        WebElement InvalidUsername=driver.findElement(By.xpath("//input[@type='email']")); // x path for usernamefield
        InvalidUsername.sendKeys("poco.com");

        WebElement InvalidPassword=driver.findElement(By.xpath("//input[@type='password']")); // x path for passwordfield
        InvalidPassword.sendKeys("nachos01");

        WebElement Signin = driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']"));// x path for sign in button
        Signin.click();

        WebElement ErrorMessage=driver.findElement(By.xpath("//li[@class='form-error__list-item']")); // display error
        ErrorMessage.getText();

    }
    @After
    public void tearDown(){
        closeBrowser(); // closing browser
    }

}

