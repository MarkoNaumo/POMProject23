package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Tab {
    @Test
    public void TabTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String orgWindows = driver.getWindowHandle(); //pocetni widows
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        for (String cur:tabs){
            driver.switchTo().window(cur);
        }
        driver.switchTo().window(orgWindows);
        driver.switchTo().window(tabs.get(1));

        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        driver.switchTo().window(tabs.get(0));

        driver.quit();
    }
}
