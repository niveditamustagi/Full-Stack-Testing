import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIVITY5 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.firefox.driver", "path_to_firefoxdriver/firefoxdriver");

        // Initialize ChromeDriver
        WebDriver driver = new FirefoxDriver();

        // Open a new browser to the URL
        driver.get("https://v1.training-support.net/selenium/input-events");

        // Get the title of the page and print it to the console
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Perform left click and print the value of the side in the front
        WebElement frontSide = driver.findElement(By.id("front"));
        System.out.println("Side in the front before left click: " + frontSide.getText());
        frontSide.click();
        System.out.println("Side in the front after left click: " + frontSide.getText());

        // Perform double click to show a random side and print the number
        Actions actions = new Actions(driver);
        WebElement cube = driver.findElement(By.id("random"));
        actions.doubleClick(cube).perform();
        System.out.println("Random side number after double click: " + cube.getText());

        // Perform right click and print the value shown on the front of the cube
        WebElement rightClickValue = driver.findElement(By.id("rightClick"));
        actions.contextClick(rightClickValue).perform();
        System.out.println("Value shown on the front of the cube after right click: " + rightClickValue.getText());

        // Close the browser
        driver.quit();
    }
}
