package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Form {
    @Test
    public void inputFormRegistration() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        //input
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
        userNumber.sendKeys("0631234567");

        //Date
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select MonthSelect = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        MonthSelect.selectByValue("10");
        Select YearSelect = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        YearSelect.selectByValue("2002");
        driver.findElement(By.className("react-datepicker__day--008")).click();

        //subject
        WebElement subjectsContainer = driver.findElement(By.id("subjectsInput"));
        subjectsContainer.sendKeys("Ucimo QA");
        subjectsContainer.click();

        WebElement hobbies = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
        hobbies.click();

        WebElement browserButton = driver.findElement(By.id("uploadPicture"));
        browserButton.sendKeys("C:\\Java\\POMProject23\\src\\test\\java\\practice\\QA-1.png");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Cometrade");

        WebElement state = driver.findElement(By.id("react-select-3-input"));
        WebElement city = driver.findElement(By.id("react-select-4-input"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", state);

        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);
        city.sendKeys("Delhi");
        state.sendKeys(Keys.ENTER);

        WebElement submit = driver.findElement(By.cssSelector(".row #submit"));
        actions.moveToElement(submit).build().perform();

        WebElement exampleModel = driver.findElement(By.id("example-modal-sizes-title-lg"));

        Assert.assertEquals(exampleModel.getText(), "Thanks for submitting the form");
        System.out.println(exampleModel.getText());

        WebElement close = driver.findElement(By.id("closeLargeModal"));
        actions.moveToElement(close).build().perform();

        driver.close();

    }
}
