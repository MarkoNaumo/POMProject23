package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import pages.Strings;

public class SortingTests extends BaseTest{

    @Test
    public void sortByPriceProductHigh()
    {
        FirefoxDriver driver = openChromeDriver();
        InventoryPage inventoryPage = new InventoryPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.Login(Strings.VALID_USERNAME, Strings.VALID_PASSWORD);
        inventoryPage.sortItemByText(Strings.DROPDOWN_BY_PRICE_HIGH);
        String firstItemPriceUnsorted = inventoryPage.getFirstItemPrice();
        Assert.assertEquals("$49.99",inventoryPage.getFirstItemPrice());
        driver.quit();
    }
}
