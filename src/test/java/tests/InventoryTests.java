package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import pages.Strings;

public class InventoryTests extends BaseTest{


    @Test
    public void AddProductInCart()
    {
        FirefoxDriver driver = openChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        loginPage.Login(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);
        inventoryPage.AddBackPackInCart();
        inventoryPage.AddSauceBikeLightInCart();

        Assert.assertEquals("2",inventoryPage.getNumberOfProductInCart());
        driver.quit();
    }
}
