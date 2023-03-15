package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IFrame {

    @Test
    public void iFrame() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/frames");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe);
        WebElement textFromIframe = driver.findElement(By.id("sampleHeading"));
        String text = textFromIframe.getText();
        driver.switchTo().defaultContent();
        System.out.println(text);
        driver.quit();
    }
}
