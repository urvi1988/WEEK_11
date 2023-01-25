package testsuite_nopcomm;

import nopcommerece.BaseTestN;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTestN {  // class name
    String baseurl= "https://demo.nopcommerce.com/"; // display url
    @Before
    public void setUp(){   // opening browser
        openBrowser(baseurl);
    }
    @Test
    public void login(){
        WebElement loginInLink= driver.findElement(By.className("ico-login")); // click on login button
        loginInLink.click();

        WebElement welcomeMsg= driver.findElement(By.xpath("//h1[contains(text(),'Welcome,Please Sign In!')]")); // display expected welcome message
        String actualText= welcomeMsg.getText();

        String expectedText="Welcome,Please Sign In!"; // display actual welcome message
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials(){
        WebElement loginInLink= driver.findElement(By.className("ico-login"));  // click on login button
        loginInLink.click();

        WebElement emailIdField=driver.findElement(By.id("Email")); // enter email
        emailIdField.sendKeys("rani.sft@gmail.com");

        WebElement passwordField=driver.findElement(By.name("Password")); //enter password
        passwordField.sendKeys("rani1988");

        WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]")); // click on login button
        loginButton.click();

        WebElement logOutLink= driver.findElement(By.className("ico-logout")); // log out message
        String actualText= logOutLink.getText();
        String expectedText="Log out";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyTheErrorMessage() {
        WebElement loginInLink = driver.findElement(By.className("ico-login")); // click on login button
        loginInLink.click();

        WebElement emailIdField = driver.findElement(By.id("Email")); // enter email
        emailIdField.sendKeys("pogo.sft@gmail.com");

        WebElement passwordFied = driver.findElement(By.name("Password")); // enetr password
        passwordFied.sendKeys("rani1988");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]")); // click on login button
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")); // display error message
        errorMessage.click();
    }
    @After
    public void tearDown() {   // closing browser
        closeBrowser();
    }
}
