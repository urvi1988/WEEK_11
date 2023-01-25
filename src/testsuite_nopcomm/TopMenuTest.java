package testsuite_nopcomm;

import nopcommerece.BaseTestN;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTestN {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click();
        WebElement ComputerText = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        ComputerText.getText();
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href=\"/electronics\"]"));
        WebElement ElectronicsText = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        ElectronicsText.getText();
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        WebElement ApparelText= driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        ApparelText.getText();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        driver.findElement(By.linkText("Digital downloads")).click();
        WebElement DigitalDownloadsText=driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        DigitalDownloadsText.getText();

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.linkText("Books")).click();
        WebElement BooksText=driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        BooksText.getText();
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.linkText("Jewelry")).click();
        WebElement JewelryText= driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        JewelryText.click();
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        driver.findElement(By.linkText("Gift Cards")).click();
        WebElement GiftCardText=driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        GiftCardText.click();
    }
    @After
    public void TearDown() {
            closeBrowser();
    }

}



