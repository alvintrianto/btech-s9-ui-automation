package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    //Construct web driver
    public dashboardPage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    //Locator
    By menuDashboard = By.xpath("//*[contains(text(),'dashboard')]");

    //Method
    //Assert err msg empty password
    public void assertMenuDashboard(){
        //get error message
        //wait
        wait.until(ExpectedConditions.presenceOfElementLocated(menuDashboard));
        //assert element
        driver.findElement(menuDashboard).isDisplayed();
    }
}
