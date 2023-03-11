package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;
import pages.Strings;

import java.time.Duration;

public class BaseTest {

    public ChromeDriver openWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Strings.LOGIN_PAGE_URL);
        return driver;
    }


//    public void scrollInToView(WebElement webElement)
//    {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argument[0].scrollIntoView(true)",webElement);
//
//    }

    public void loginWithValidData(ChromeDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login(Strings.VALID_USERNAME,Strings.VALID_PASSWORD);
    }
}
