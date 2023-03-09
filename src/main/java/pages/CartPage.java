package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeSauceLabsBike;
    @FindBy(id = "checkout")
    WebElement checkoutButton;
    @FindBy(id = "continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(className = "inventory_item_desc")
    WebElement inventoryItemDescription;
    @FindBy(className = "inventory_item_price")
    WebElement inventoryItemPrice;
    @FindBy(className = "inventory_item_name")
    WebElement inventoryItemName;


    public void clickRemoveSauceLabsBike(){
        removeSauceLabsBike.click();
    }

    public void clickCheckout(){
        checkoutButton.click();
    }

    public void clickContinueShopping(){
        continueShoppingButton.click();
    }

    public String getItemDesc(){
        return inventoryItemDescription.getText();
    }

    public String getItemPrice(){
        return inventoryItemPrice.getText();
    }

    public String getItemName(){
        return inventoryItemName.getText();
    }
    public CartPage(FirefoxDriver driver){
        PageFactory.initElements(driver,this);
    }
}
