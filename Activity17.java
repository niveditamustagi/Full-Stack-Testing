import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {
    public static void main(String[] args) {

        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/selects");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Select the second option using the visible text
        Select singleSelect = new Select(driver.findElement(By.id("single-select")));
        singleSelect.selectByVisibleText("Option 2");

        // Select the third option using the index
        singleSelect.selectByIndex(2); // Index starts from 0

        // Select the fourth option using the value
        singleSelect.selectByValue("4");

        // Get all the options and print them to the console
        List<WebElement> options = singleSelect.getOptions();
        System.out.println("All options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
