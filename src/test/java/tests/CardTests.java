package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;

public class CardTests extends BaseTest {

    private ChromeDriver driver;
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        driver = openWebDriver();
        loginWithValidData(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
    }
        @Test
        public void checkProductIsInCart(){
        inventoryPage.AddSauceBikeLightInCart();
        inventoryPage.clickOnShoppingCart();
        var name = cartPage.getItemName();
        var desc = cartPage.getItemDesc();
        var price = cartPage.getItemPrice();
        Assert.assertEquals("Sauce Labs Bike Light",name);
        Assert.assertEquals("A red light isn't the desired state in testing but it sure helps when riding your bike at night." +
                " Water-resistant with 3 lighting modes, " +
                "1 AAA battery included.",desc);
        Assert.assertEquals("$9.99",price);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
