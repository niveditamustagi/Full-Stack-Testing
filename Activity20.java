import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) {

        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Find the button to open a PROMPT alert and click it
        WebElement promptButton = driver.findElement(By.cssSelector("button#prompt"));
        promptButton.click();

        // Switch the focus from the main window to the Alert box
        Alert promptAlert = driver.switchTo().alert();

        // Get the text in the alert box and print it
        String alertText = promptAlert.getText();
        System.out.println("Alert text: " + alertText);

        // Type "Awesome!" into the prompt
        promptAlert.sendKeys("Awesome!");

        // Close the alert by clicking Ok
        promptAlert.accept();

        // Close the browser
        driver.quit();
    }
}

