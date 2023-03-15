package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class InventoryTests extends BaseTest{

    private ChromeDriver driver;
    private InventoryPage inventoryPage;

    @BeforeMethod
    public void setUp() {
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

    @Test
    public void faceBook(){
        inventoryPage.facebookSwitch();
        Assert.assertEquals("https://www.facebook.com/saucelabs",driver.getCurrentUrl());
    }
    @Test
    public void twitter(){
        inventoryPage.twitterSwitch();
        Assert.assertEquals("https://twitter.com/saucelabs",driver.getCurrentUrl());
    }

    @Test
    public void linkedin(){
        inventoryPage.linkedinSwitch();
        Assert.assertEquals("https://www.linkedin.com/company/sauce-labs/?original_referer=",driver.getCurrentUrl());
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
