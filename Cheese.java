import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cheese {
    public static void main(String[] args) {

        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open Google homepage
        driver.get("https://www.google.com");

        // Find the search input field and enter the search query "cheese"
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("cheese");

        // Submit the search
        searchInput.submit();

        // Wait for the search results to load
        try {
            Thread.sleep(2000); // Wait for 2 seconds for the results to load (you can adjust this if needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the element containing the search result count and print it
        WebElement searchResultCount = driver.findElement(By.id("result-stats"));
        System.out.println("Search Results: " + searchResultCount.getText());

        // Close the browser
        driver.quit();
    }
}

