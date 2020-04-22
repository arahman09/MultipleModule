package MicrosoftHomeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class MicrosoftHome {

 public  WebDriver driver = null;

    @BeforeMethod

    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/volumes/D/Driver/FireFox/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.Microsoft.com");
        driver.manage().window().maximize();
    }

    @AfterMethod

    public void cleanUp() {
        driver.close();


    }
}

