package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alert {

    @Test
    public void Alert() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        driver.switchTo().alert().accept();

//        WebElement alertTimeButton = driver.findElement(By.id("timerAlertButton"));
//        alertTimeButton.click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().accept();
//        driver.quit();
//
//        WebElement alertTimeButton1 = driver.findElement(By.id("confirmButton"));
//        alertTimeButton1.click();
//        String alertText1 =driver.switchTo().alert().getText();
//        System.out.println(alertText1);
//        driver.switchTo().alert().dismiss();
//        driver.quit();
//
//        WebElement alertTimeButton2 = driver.findElement(By.id("promtButton"));
//        alertTimeButton2.click();
//        String alertText2 =driver.switchTo().alert().getText();
//        System.out.println(alertText2);
//        driver.switchTo().alert().sendKeys("Marko");
//        driver.switchTo().alert().accept();
        driver.quit();
    }
}
