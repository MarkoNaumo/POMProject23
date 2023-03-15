package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    WebElement user_name;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement login_button;
    @FindBy(css = ".error h3")
    WebElement errorMessage;

    public LoginPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Login(String userName, String pass) {
        user_name.sendKeys(userName);
        password.sendKeys(pass);
        login_button.click();

    }

    public String getTextFromErrorMessage() {
        return errorMessage.getText();
    }
}
