package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

/**
 * Base class to initialize WebDriver and load properties.
 * Author: Harshit Tomar
 */

public class Base {

    public static WebDriver driver;
    public static FileInputStream file;
    public static Properties prop;

    /**
     * Author : Harshit Tomar
     * Loads properties from the specified properties file.
     * 
     * @throws IOException if the properties file cannot be loaded.
     *     
     */

    public void loadProperties() throws IOException {
        String propertiesPath = System.getProperty("user.dir") + "/config/config.properties";
        try {
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    /**
     * Author : Harshit Tomar
     * Opens a browser based on the properties file configuration.
     * Initializes the WebDriver and sets up browser options.
     *     
     */

    public void openBrowser() {

        try {
            loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String executionType = prop.getProperty("executiontype");
        String browserName = prop.getProperty("browser");

        if ("remote".equalsIgnoreCase(executionType)) {
            URL gridUrl;
            try {
                gridUrl = new URL(prop.getProperty("gridurl"));
                driver = new RemoteWebDriver(gridUrl, new ChromeOptions());
            } catch (MalformedURLException e) {

                e.printStackTrace();
            }

        } else if ("local".equalsIgnoreCase(executionType)) {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                default:
                    System.err.println("Unsupported browser: " + browserName);
                    break;
            }
        } else {
            System.err.println("Invalid execution type: " + executionType);
        }

        if (driver != null)

        {
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        }
        // Dont remove the listener Object

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

    }

}
