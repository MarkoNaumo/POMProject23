package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Upload {

    @Test
    public void uploadButtonTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        WebElement browserButton = driver.findElement(By.id("uploadFile"));
        browserButton.sendKeys("C:\\Java\\POMProject23\\src\\test\\java\\practice\\QA-1.png");
        driver.quit();
    }
}
