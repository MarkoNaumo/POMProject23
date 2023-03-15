package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMenu {

    public SelectMenu() {
    }

    @Test
    public void selectMenu(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement select = driver.findElement(By.id("oldSelectMenu"));
        Select menu = new Select(select);
        menu.selectByVisibleText("White");
        driver.quit();
    }
}
