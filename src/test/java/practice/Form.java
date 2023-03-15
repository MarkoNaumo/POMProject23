package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Form {
    @Test
    public void inputFormRegistration(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Marko");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Naumovic");
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("marko@mail.com");

        //Gender select
        WebElement gender = driver.findElement(By.id("gender-radio-1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(gender).click().perform();
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("063123456");

        //Date
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select MonthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        MonthSelect.selectByValue("10");
        Select YearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        YearSelect.selectByValue("2002");
        driver.findElement(By.className("react-datepicker__day--008")).click();

    }
}
