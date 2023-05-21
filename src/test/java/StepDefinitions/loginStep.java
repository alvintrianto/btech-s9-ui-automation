package StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.loginPage;
import pageObjects.dashboardPage;

import java.time.Duration;

public class loginStep {
    WebDriver driver = null;

    @Given("I on the kasir aja login page")
    public void openKasirAjaLoginPage(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\alvin\\IdeaProjects\\BtechS9-UIAutomation\\src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Base URL
        String baseUrl = "https://kasirdemo.belajarqa.com";

        //Open Chrome and set the url
        driver.get(baseUrl);

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
    }

    @When("I input valid email")
    public void userInputValidEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        loginPage loginpage = new loginPage(driver,wait);

        loginpage.inputEmail("trial2-toko@gmail.com");
    }

    @And("I input valid password")
    public void userInputValidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        loginPage loginpage = new loginPage(driver,wait);

        loginpage.inputPassword("password");
    }

    @And("I click login button")
    public void userClickLoginButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        loginPage loginpage = new loginPage(driver,wait);

        loginpage.clickBtnLogin();
    }

    @Then("User is on dashboard page")
    public void userInDashboardPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        dashboardPage dashboardpage = new dashboardPage(driver,wait);

        dashboardpage.assertMenuDashboard();
    }

    @Then("User got error message password field empty")
    public void userGotErrMsgPassFieldEmpty(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        loginPage loginpage = new loginPage(driver,wait);

        loginpage.assertErrMsgEmptyPassword();
    }

}
