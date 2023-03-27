package tests;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GuestRegistatration {
    @Test
    public void Registraion() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.id("first_name")).sendKeys("Dejan");
        driver.findElement(By.id("last_name")).sendKeys("Stancevic");
        driver.findElement(By.id("user_email")).sendKeys("dejana.dejan@hotmail.com");
        WebElement radio_button = driver.findElement(By.id("radio_1665627729_Male"));
        radio_button.click();
        driver.findElement(By.id("user_pass")).sendKeys("AlfaRomeo156");

        //date of birth
        driver.findElement(By.xpath("//input[@id='load_flatpickr'][1]")).click();
        Select monthSelect = new Select(driver.findElement(By.className("flatpickr-monthDropdown-months")));
        monthSelect.selectByValue("5");
        WebElement boxYear = driver.findElement(By.cssSelector(".numInputWrapper .cur-year")); //css selector mozes da mu napravis
        boxYear.clear(); // posto je inut mozes da mu kazes clear da obrise
        boxYear.sendKeys("2021"); // ovde mu posaljes novu god.
        WebElement day = driver.findElement(By.xpath("//span[contains(@class, 'flatpickr-day ') and text()='20']"));
        day.click(); // ovo sam napravio jer nikako dda izabere pravi datum


        driver.findElement(By.id("input_box_1665629217")).sendKeys("Serbian");
        WebElement phone = driver.findElement(By.name("phone_1665627880"));
        phone.click();
        phone.sendKeys("0631978861");
        WebElement country = driver.findElement(By.id("country_1665629257"));
        country.sendKeys("Serbia");
        country.click();
        country.sendKeys(Keys.ENTER);
        WebElement emergencyContact = driver.findElement(By.name("phone_1665627865"));
        emergencyContact.click();
        emergencyContact.sendKeys("0631978865");

        js.executeScript("arguments[0].scrollIntoView(true);", emergencyContact);
        //date arrive
        WebElement dataOfArrive = driver.findElement(By.cssSelector("#load_flatpickr[data-label='Date of Arrival']"));
        dataOfArrive.click();
        Select monthSelecte = new Select(driver.findElement(By.xpath("(//select[@aria-label='Month'])[2]")));
        monthSelecte.selectByValue("9");
        WebElement year = driver.findElement(By.cssSelector(".numInputWrapper .cur-year"));
        year.clear();
        year.sendKeys("2000");
        driver.findElement(By.xpath("//span[contains(@class, 'flatpickr-day ') and text()='20']"));
//           Isiti selectori kao iz date og birth  preskoci ovo da te ne buni


        js.executeScript("window.scroll(0,500)");
        driver.findElement(By.id("number_box_1665629930")).sendKeys("2");
        driver.findElement(By.id("input_box_1665630010")).sendKeys("TwoBeds");
        driver.findElement(By.id("textarea_1665630078")).sendKeys("QA TESTER ON SOFTWARE PROJECTS");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;

        js.executeScript("window.scroll(0,1000)");
        WebElement radioButton2 = driver.findElement(By.id("radio_1665627931_Yes"));
        radioButton2.click();
        WebElement radioButton3 = driver.findElement(By.id("radio_1665627997_Single Room"));
        radioButton3.click();
        WebElement radioButon4 = driver.findElement(By.id("radio_1665628131_None"));
        radioButon4.click();
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scroll(0,2000)");
        WebElement Activities = driver.findElement(By.id("select_1665628361"));
        Activities.sendKeys("T");
        Activities.click();
        Activities.sendKeys(Keys.ENTER);
        driver.findElement(By.id("privacy_policy_1665633140")).click();
        WebElement element = driver.findElement(By.cssSelector(".ur-submit-button span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
        driver.quit();

    }
}
