package nopcommerece;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTestN {
    public static WebDriver driver;
    public void openBrowser(String baseurl) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public void closeBrowser(){
        driver.quit();
}
}
