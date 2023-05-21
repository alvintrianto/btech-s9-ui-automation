package helper;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hooks extends env {

    public void  before() throws MalformedURLException{
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel 4");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","12.0");
        capabilities.setCapability("app","C:\\Users\\alvin\\Downloads\\kasirdemo.apk");

        URL url = new URL(mobileBaseUrl);
        mobileDriver = new AndroidDriver(url,capabilities);
        mobileDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void after(){
        mobileDriver.quit();
    }
}
