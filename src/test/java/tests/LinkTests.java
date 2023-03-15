package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class LinkTests extends BaseTest {

    ChromeDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
    }
}
