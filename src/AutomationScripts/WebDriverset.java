package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverset {
	
	public static WebDriver driver;

    public static WebDriver first() {
        if (driver == null) {
            // Choose your browser driver based on preference (e.g., ChromeDriver, FirefoxDriver)
        	//System.setProperty("webdriver.chrome.driver", "C:/Users/nyar/Documents/chromedriver-win64/chromedriver.exe");
        	WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
