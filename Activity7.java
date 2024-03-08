import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        // Set the path to the geckodriver executable (Firefox driver)

        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open a new browser to the URL
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        // Get the title of the page and print it to the console
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Perform click and drag to move the ball into "Dropzone 1"
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(ball, dropzone1).perform();

        // Verify that the ball has entered Dropzone 1
        String dropzone1Text = dropzone1.getText();
        if (dropzone1Text.equals("Dropped!")) {
            System.out.println("Ball has entered Dropzone 1");
        } else {
            System.out.println("Ball has not entered Dropzone 1");
        }

        // Perform click and drag to move the ball into "Dropzone 2"
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        actions.dragAndDrop(ball, dropzone2).perform();

        // Verify that the ball has entered Dropzone 2
        String dropzone2Text = dropzone2.getText();
        if (dropzone2Text.equals("Dropped!")) {
            System.out.println("Ball has entered Dropzone 2");
        } else {
            System.out.println("Ball has not entered Dropzone 2");
        }

        // Close the browser
        driver.quit();
    }
}
