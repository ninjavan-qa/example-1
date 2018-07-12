package co.nvqa.example_1.glue;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Daniel Joi Partogi Hutapea
 */
public class Sample02Steps
{
    private static final long DELAY_IN_MILLIS = 1_000;
    private WebDriver webDriver;

    public Sample02Steps()
    {
    }

    @Given("User opens a browser and go to Wikipedia homepage on this URL \"([^\"]*)\"")
    public void goToWikipediaHomepage(String url) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--window-size=1366,768");
        chromeOptions.addArguments("--window-position=0,0");

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.get(url);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @When("User types \"([^\"]*)\" on the search input")
    public void inputSearchText(String searchText) throws InterruptedException
    {
        WebElement searchInputWe = webDriver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInputWe.sendKeys(searchText);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @And("User clicks submit button")
    public void clickSubmitButton() throws InterruptedException
    {
        WebElement submitButtonWe = webDriver.findElement(By.xpath("//button[@type='submit']"));
        submitButtonWe.click();
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @Then("User verifies the result page title is \"([^\"]*)\"")
    public void verifyTheResultPage(String expectedPageTitle) throws InterruptedException
    {
        WebElement firstHeadingWe = webDriver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String actualPageTitle = firstHeadingWe.getText();
        Assert.assertEquals("Title is different.", expectedPageTitle, actualPageTitle);
        Thread.sleep(DELAY_IN_MILLIS);
    }

    @After("@CloseBrowser")
    public void closeBrowser()
    {
        if(webDriver!=null)
        {
            webDriver.quit();
        }
    }
}
