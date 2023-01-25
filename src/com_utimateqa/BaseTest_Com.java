package com_utimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest_Com { // class name
    public static WebDriver driver;
    public void openBrowser(String baseurl) {
        ChromeOptions options=new ChromeOptions(); // setting webdriver
        driver=new ChromeDriver(options);// creating object of driver
        driver.get(baseurl);//launch url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //
    }
    public void closeBrowser(){
        driver.quit();
    }
}

