package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class InventoryTests extends BaseTest{

    private FirefoxDriver driver;
    private InventoryPage inventoryPage;

    @BeforeMethod
    public void setUp() {
        // Set up the driver, InventoryPage, and CartPage before each test method
        driver = openWebDriver();
        loginWithValidData(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void AddProductInCart()
    {
        inventoryPage.AddBackPackInCart();
        inventoryPage.AddSauceBikeLightInCart();

        Assert.assertEquals("2",inventoryPage.getNumberOfProductInCart());
    }

    @AfterMethod
    public void tearDown() {
        // Close the driver after each test method
        driver.quit();
    }
}
