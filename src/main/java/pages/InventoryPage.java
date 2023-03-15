package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage extends BasePage {


    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddBackPack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement AddSauceBikeLight;

    @FindBy(css = "#shopping_cart_container .shopping_cart_badge")
    WebElement shoppingCart;

    @FindBy(className = "product_sort_container")
    WebElement sortDropDown;

    public void AddBackPackInCart() {
        AddBackPack.click();
    }

    public void AddSauceBikeLightInCart() {
        AddSauceBikeLight.click();
    }

    public String getNumberOfProductInCart() {
        return shoppingCart.getText();
    }

    public void sortItemByText(String text) {
        Select dropdown = new Select(sortDropDown);
        dropdown.selectByVisibleText(text);

    }

    public String getFirstItemPrice(){
        List<WebElement> items = driver.findElements(By.className("inventory_item"));
        WebElement firstItem =  items.get(0);
        WebElement firstItemPrice = firstItem.findElement(By.className("inventory_item_price"));
        return firstItemPrice.getText();
    }

    public InventoryPage(ChromeDriver driver) {
        print("Open Inventory page");
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
