package suites;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class loginMobile {
    private static AppiumDriver driver;
    private static DesiredCapabilities capabilities;


    public static void main(String[] args) throws MalformedURLException,InterruptedException{

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel 4");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12.0");
        //capabilities.setCapability("app","C:\\Users\\alvin\\Downloads\\kasirdemo.apk");
        capabilities.setCapability("forceAppLaunch",false);
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("appPackage","com.kasirajaandroid");
        capabilities.setCapability("appActivity",".MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,capabilities);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")).sendKeys("email.com");

        //driver.quit();
    }
}
