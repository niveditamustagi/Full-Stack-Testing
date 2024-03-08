import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AActivity11 {
    public static void main(String[] args) {


        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Find the checkbox input element
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

        // Check if the checkbox is selected and print the result
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }

        // Click the checkbox to select it
        checkbox.click();

        // Check if the checkbox is selected again and print the result
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected after clicking.");
        } else {
            System.out.println("Checkbox is not selected after clicking.");
        }

        // Close the browser
        driver.quit();
    }
}

