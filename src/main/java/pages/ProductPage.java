package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    ChromeDriver driver;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddBackPack;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement AddSauceBikeLight;


    public void AddBackPackInCart(){
        AddBackPack.click();
    }
    public void AddSauceBikeLightInCart(){
        AddSauceBikeLight.click();
    }

    public ProductPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
