package testsuite_nopcomm;

import nopcommerece.BaseTestN;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTestN { // class name

        String baseurl= "https://demo.nopcommerce.com/"; // displaying url
        public void setUp(){
            openBrowser(baseurl);
        }
        @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
            driver.findElement(By.className("ico-register")).click();
            WebElement registerText = driver.findElement(By.xpath("//a[@class='ico-register']")); // click on register
            registerText.getText();

            WebElement RadioButtonMale = driver.findElement(By.xpath("//input[@id='gender-male']")); //  click on gender
            RadioButtonMale.click();

            WebElement RadioButtonFemale = driver.findElement(By.xpath("//input[@id='gender-female']")); // click on gender
            RadioButtonFemale.click();
            String GenderToBeSelected = "Male";

            WebElement firstName =driver.findElement(By.id("FirstName")); //  send keys to firstname
            firstName.sendKeys("Jess");

            WebElement lastname = driver.findElement(By.id("LastName")); // send keys to lastname
            lastname.sendKeys("Sony");

            WebElement email = driver.findElement(By.id("Email")); // write email
            email.sendKeys("pogo.gmail.com");

            WebElement password = driver.findElement(By.name("Password")); // write password
            password.sendKeys("banana123");

            WebElement confirmpassword=driver.findElement(By.name("")); // confirm password
            confirmpassword.sendKeys("banana123");

            WebElement Registerbutton=driver.findElement(By.xpath("//button[@id='register-button']")); // click on register button
            Registerbutton.click();
        }
        @After
    public void tearDown() { // closing browser
            closeBrowser();
        }

}