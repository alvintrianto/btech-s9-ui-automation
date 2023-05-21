package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class env {
    public static AppiumDriver mobileDriver;
    public static DesiredCapabilities capabilities;

    public static int duration = 10;

    public static String mobileBaseUrl = "http://127.0.0.1:4723/wd/hub";
}
