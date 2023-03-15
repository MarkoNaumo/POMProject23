package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DraggablePage {

    @Test
    public void dragDrop(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/droppable");
        driver.manage().window().maximize();

        Actions builder = new Actions(driver);

        WebElement from = driver.findElement(By.id("draggable"));

        WebElement to = driver.findElement(By.id("droppable"));

        builder.dragAndDrop(from, to).perform();

        String textTo = to.getText();

        if(textTo.equals("Dropped!")) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
