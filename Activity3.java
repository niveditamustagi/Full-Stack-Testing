import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // Set the path to fireDriver
        System.setProperty("webdriver.Firefox.driver", "path_to_firefoxdriver");

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open the browser to the specified URL
        driver.get("https://v1.training-support.net/selenium/login-form");

        // Get the title of the page and print it to the console
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);

        // Find the username field using any locator and enter "admin" into it
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("admin");

        // Find the password field using any locator and enter "password" into it
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password");

        // Find the "Log in" button using any locator and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}