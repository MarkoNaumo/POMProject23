package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage{
    ChromeDriver driver;
    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburgerMenu;
    @FindBy(css = "#shopping_cart_container .shopping_cart_badge")
    WebElement shoppingCart;


    public void clickOnHamburgerMenu(){
        hamburgerMenu.click();
    }
    public void clickOnShoppingCart(){
        shoppingCart.click();
    }

    public static void print(String s){
        System.out.println(s);
    }
}
