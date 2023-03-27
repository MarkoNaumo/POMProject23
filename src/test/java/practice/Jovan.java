package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Jovan {

    @Test
    public void form(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demo.wpeverest.com/user-registration/ guest-registration-form/");

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Jovan");
        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("Dzodan");
        WebElement email = driver.findElement(By.id("user_email"));
        email.sendKeys("Jovan@gmail.com");
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("Jovan12345!");
        WebElement gender = driver.findElement(By.id("radio_1665627729_Male"));
        Actions actions = new Actions(driver);
        actions.moveToElement(gender).click().perform();
        driver.findElement(By.id("load_flatpickr")).click();
        //driver.findElement(By.className("flatpickr-monthDropdown- months")).click();
        Select monthSelect = new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));
        monthSelect.selectByValue("0");
        driver.findElement(By.className("numInputWrapper")).click();
        WebElement yearSelect = driver.findElement(By.className("numInput"));
        yearSelect.sendKeys("1993");
        WebElement div = driver.findElement(By.className("dayContainer"));
        div.findElement(By.xpath("./span[text()='20']")).click();
        WebElement nat = driver.findElement(By.id("input_box_1665629217"));
        nat.sendKeys("Serbian");
        WebElement phonee = driver.findElement(By.cssSelector("input[id=phone_1665627880]"));
        phonee.sendKeys("0649154318");
        WebElement ephonee = driver.findElement(By.cssSelector("input[id=phone_1665627865"));
        ephonee.sendKeys("0631112221");
        driver.findElement(By.id("country_1665629257")).click();
        Select Drzava = new Select(driver.findElement(By.id("country_1665629257")));
        Drzava.selectByValue("RS");
        WebElement LengthofStay = driver.findElement(By.id("number_box_1665629930"));
        LengthofStay.sendKeys("10");
        WebElement RoomandBed = driver.findElement(By.id("input_box_1665630010"));
        RoomandBed.sendKeys("3");
        WebElement Occupation = driver.findElement(By.id("textarea_1665630078"));
        Occupation.sendKeys("QA tester najjaci");
        driver.findElement(By.id("radio_1665627931_Yes")).click();
        driver.findElement(By.id("radio_1665627997_Single Room")).click();
        driver.findElement(By.id("radio_1665628131_Glutten Allergy")).click();
        driver.findElement(By.id("select_1665628361")).click();
        Select TownHall = new Select(driver.findElement(By.id("select_1665628361")));
        TownHall.selectByValue("Town Hall");
        driver.findElement(By.id("privacy_policy_1665633140")).click();

    }
}
