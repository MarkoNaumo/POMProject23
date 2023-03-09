package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.Strings;

public class SortingTests extends BaseTest{

    private FirefoxDriver driver;
    private InventoryPage inventoryPage;

    @BeforeMethod
    public void setUp() {
        // Set up the driver, InventoryPage, and CartPage before each test method
        driver = openChromeDriver();
        loginWithValidData(driver);
        inventoryPage = new InventoryPage(driver);
    }
    @Test
    public void sortByPriceProductHigh()
    {
        inventoryPage.sortItemByText(Strings.DROPDOWN_BY_PRICE_HIGH);
        inventoryPage.getFirstItemPrice();
        Assert.assertEquals("$49.99",inventoryPage.getFirstItemPrice());
    }

    @Test
    public void sortByPriceProductLow()
    {
        inventoryPage.sortItemByText(Strings.DROPDOWN_BY_PRICE_LOW);
        inventoryPage.getFirstItemPrice();
        Assert.assertEquals("$7.99",inventoryPage.getFirstItemPrice());
    }

    @AfterMethod
    public void tearDown() {
        // Close the driver after each test method
        driver.quit();
    }
}
