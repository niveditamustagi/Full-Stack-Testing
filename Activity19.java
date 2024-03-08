
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {

        // Initialize Firefox WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        // Get the title of the page and print it to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Find the button to open a CONFIRM alert and click it
        driver.findElement(By.cssSelector("button#confirm")).click();

        // Switch the focus from the main window to the Alert box
        Alert confirmAlert = driver.switchTo().alert();

        // Get the text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Alert text: " + alertText);

        // Close the alert once with Ok
        confirmAlert.accept();

        // Find the button to open a CONFIRM alert again and click it
        driver.findElement(By.cssSelector("button#confirm")).click();

        // Switch back to the alert box
        confirmAlert = driver.switchTo().alert();

        // Close the alert again with Cancel
        confirmAlert.dismiss();

        // Close the browser
        driver.quit();
    }
}
