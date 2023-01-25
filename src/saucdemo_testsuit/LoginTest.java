package saucdemo_testsuit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import saucdemo.BaseTestS;

public class LoginTest extends BaseTestS {

    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {
        WebElement Usernamefield = driver.findElement(By.xpath("//input[@id='user-name']")); // enter username
        Usernamefield.sendKeys("standard_user");

        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']")); // enter password
        passwordfield.sendKeys("secret_sauce");

        WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']")); // click on login button
        LoginButton.click();

        WebElement products = driver.findElement(By.xpath("//span[@class='title']")); // click on products
        products.getText();

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        WebElement Usernamefield = driver.findElement(By.xpath("//input[@id='user-name']")); // enter username
        Usernamefield.sendKeys("standard_user");

        WebElement passwordfield = driver.findElement(By.xpath("//input[@id='password']")); // enter password
        passwordfield.sendKeys("secret_sauce");

        WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']")); // click on login button
        LoginButton.click();

        WebElement sixproducts = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")); // display 6 products
        sixproducts.getText();
    }

        @After
        public void tearDown() {  // closing browser
            closeBrowser();


        }
    }


