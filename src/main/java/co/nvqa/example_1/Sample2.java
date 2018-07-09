package co.nvqa.example_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Daniel Joi Partogi Hutapea
 */
public class Sample2
{
    public static void main(String[] args) throws InterruptedException
    {
        long delayInMillis = 1_000;
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--window-size=1366,768");
        chromeOptions.addArguments("--window-position=0,0");

        WebDriver webDriver = new ChromeDriver(chromeOptions);
        webDriver.get("https://www.wikipedia.org/");
        Thread.sleep(delayInMillis);

        String expectedTitle = "Selenium";
        WebElement searchInputWe = webDriver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInputWe.sendKeys(expectedTitle);
        Thread.sleep(delayInMillis);

        WebElement submitButtonWe = webDriver.findElement(By.xpath("//button[@type='submit']"));
        submitButtonWe.click();
        Thread.sleep(delayInMillis);

        WebElement firstHeadingWe = webDriver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String actualTitle = firstHeadingWe.getText();
        Assert.assertEquals("Title is different.", expectedTitle, actualTitle);
        Thread.sleep(delayInMillis);

        webDriver.close();
    }
}
