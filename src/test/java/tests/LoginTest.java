package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Strings;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredential() {
        FirefoxDriver driver = openChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.Login(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);
            assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL):"Wrong URL Expected: " +Strings.INVENTORY_PAGE_URL;
        } finally {
            driver.quit();
        }
    }
    @Test
    public void loginWithInvalidValidCredential() {
        FirefoxDriver driver = openChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.Login(Strings.VALID_USERNAME, "secret_saucess");
            Assert.assertEquals(loginPage.getTextFromErrorMessage(),Strings.ERROR_MESSAGE,"Wrong");
        } finally {
            driver.quit();
        }
    }
}
