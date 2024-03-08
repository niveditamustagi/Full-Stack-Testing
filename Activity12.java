import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {
    public static void main(String[] args) {


        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Find the text field
        WebElement textField = driver.findElement(By.cssSelector("input[type='text']"));

        // Check if the text field is enabled and print it
        if (textField.isEnabled()) {
            System.out.println("Text field is enabled.");
        } else {
            System.out.println("Text field is not enabled.");
        }

        // Click the "Enable Input" button to enable the input field
        WebElement enableButton = driver.findElement(By.cssSelector("#toggleInput"));
        enableButton.click();

        // Check if the text field is enabled again and print it
        if (textField.isEnabled()) {
            System.out.println("Text field is enabled after clicking the button.");
        } else {
            System.out.println("Text field is not enabled after clicking the button.");
        }

        // Close the browser
        driver.quit();
    }
}

