import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Iphone {
    public static void main(String[] args) {

        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open Amazon website
        driver.get("https://www.amazon.com");

        // Find the search input field and enter the search query "iPhone 15"
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("iPhone 15");

        // Submit the search
        searchInput.submit();

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")));

        // Find all the search results
        java.util.List<WebElement> searchResults = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

        // Check if there are at least 3 search results
        if (searchResults.size() >= 3) {
            // Click on the 3rd search result
            searchResults.get(2).click();

            // Wait for the product details to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));

            // Get the price and all information of the 3rd phone
            WebElement productTitle = driver.findElement(By.id("productTitle"));
            WebElement productPrice = driver.findElement(By.cssSelector("span.a-price span.a-offscreen"));

            // Print the information
            System.out.println("Product Title: " + productTitle.getText());
            System.out.println("Product Price: " + productPrice.getText());
        } else {
            System.out.println("There are less than 3 search results.");
        }

        // Close the browser
        driver.quit();
    }
}
