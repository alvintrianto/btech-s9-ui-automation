package suites;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class loginTestNg {
    @Test
    public void loginByTestNg() throws InterruptedException {
        //Defining and locate chrome driver location
        System.setProperty("webdriver.chrome.driver","C:\\Users\\alvin\\IdeaProjects\\BtechS9-UIAutomation\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        //Base URL
        String baseUrl = "https://kasirdemo.belajarqa.com/";

        //Open Chrome and set the url
        driver.get(baseUrl);

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();

        //Assert title and url'
        Assertions.assertEquals("kasirAja",title);
        Assertions.assertEquals("https://kasirdemo.belajarqa.com/login",url);

        //Get Element Email & Input data
        driver.findElement(By.id("email")).sendKeys("contoh@gmail.com");

        //click element
        driver.findElement(By.xpath("//*[contains(text(),'login')]")).click();

        //get error message
        //wait
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'is not allowed to be empty')]")));
        //assert element
        driver.findElement(By.xpath("//*[contains(text(),'is not allowed to be empty')]")).isDisplayed();
        //close chrome
        //driver.close();

        //close chrome
        driver.close();
    }

}
