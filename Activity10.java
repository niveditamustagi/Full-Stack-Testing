import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10{
    public static void main(String[] args) {


        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Find the checkbox input element
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

        // Check if it is visible on the page
        if (checkbox.isDisplayed()) {
            System.out.println("Checkbox is visible on the page.");
        }

        // Click the "Remove Checkbox" button
        WebElement removeButton = driver.findElement(By.cssSelector("#toggleCheckbox"));
        removeButton.click();

        // Check if it is visible again and print the result
        if (!checkbox.isDisplayed()) {
            System.out.println("Checkbox is not visible after removal.");
        }

        // Close the browser
        driver.quit();
    }
}
