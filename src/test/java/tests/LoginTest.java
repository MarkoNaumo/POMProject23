package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredential() {
        ChromeDriver driver = openChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.Login("standard_user", "secret_sauce");
        } finally {
            driver.quit();
        }
    }
    @Test
    public void loginWithUnValidCredential() {
        ChromeDriver driver = openChromeDriver();
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.Login("standard", "secret_sauce");
        } finally {
            driver.quit();
        }
    }

}
