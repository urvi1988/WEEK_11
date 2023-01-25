package herokuapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTestHc extends BaseTestH { // class name
    String baseurl = "http://the-internet.herokuapp.com/login"; // display url
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        WebElement Usernamefield=driver.findElement(By.xpath("//input[@id='username']")); // enter username in usename field
        Usernamefield.sendKeys("tomsmith");

        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']")); // enter password in password field
        passwordfield.sendKeys("SuperSecretPassword!");

        WebElement LoginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")); // click on login button
        LoginButton.click();

        WebElement securetext=driver.findElement(By.xpath("//i[@class='icon-lock']")); // display error
        securetext.getText();

        //WebElement SecureText=driver.
        // WebElement SecureText=driver.findElement(By.linkText(" Secure Area"));
        //SecureText.getText(

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        WebElement Usernamefield=driver.findElement(By.xpath("//input[@id='username']")); // enter wrong username
        Usernamefield.sendKeys("tomsmith1");

        WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']")); // enter wrong password
        passwordfield.sendKeys("SuperSecretPassword");

        WebElement LoginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")); // click on login button
        LoginButton.click();

        WebElement ErrorMessage=driver.findElement(By.xpath("//div[@id='flash']")); // display error massage
        ErrorMessage.getText();

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        WebElement Usernamefield=driver.findElement(By.xpath("//input[@id='username']")); // enter username
        Usernamefield.sendKeys("tomsmith");

        WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']")); // enter password
        passwordfield.sendKeys("SuperSecretPassword");

        WebElement LoginButton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")); // click on login button
        LoginButton.click();

        WebElement ErrorMessage=driver.findElement(By.xpath("//div[@id='flash']")); //display error message
        ErrorMessage.getText();
    }
    @After
    public void tearDown() {
        closeBrowser();

        }
}
