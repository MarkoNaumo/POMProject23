package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    ChromeDriver driver;

    @FindBy(id ="user-name")
    WebElement user_name;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement login_button;

    public LoginPage(ChromeDriver driver){
        driver.get("https://www.saucedemo.com/");
        PageFactory.initElements(driver,this);
    }

    public void Login(String userName,String pass)
    {
        user_name.sendKeys(userName);
        password.sendKeys(pass);
        login_button.click();
    }
}
