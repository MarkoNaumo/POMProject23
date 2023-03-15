package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;

public class LoginTest extends BaseTest {

    ChromeDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginWithValidCredential() {

        loginPage.Login(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);
        assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL) : "Wrong URL Expected: " + Strings.INVENTORY_PAGE_URL;
    }

    @Test
    public void loginWithInvalidValidCredential() {

        loginPage.Login(Strings.INVALID_USERNAME, Strings.VALID_PASSWORD);
        Assert.assertEquals(loginPage.getTextFromErrorMessage(), Strings.ERROR_MESSAGE, "Wrong");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
