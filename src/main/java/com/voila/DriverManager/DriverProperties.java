package com.voila.DriverManager;

import com.voila.Utilities.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverProperties {

    static ConfigFileReader config = null;
    public static WebDriver driver;

    public static void start_session() throws IOException {
        config = new ConfigFileReader();

        if (config.getBrowser().equals("MOZILLA")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        if (config.getBrowser().equals("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        String url = config.getURL();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void close_session() {
        driver.quit();
    }
}
