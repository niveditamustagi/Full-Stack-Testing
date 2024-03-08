import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone15 {
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

        // Find the 3rd iPhone 15 in the search results
        WebElement thirdPhoneTitle = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        WebElement thirdPhonePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));

        // Get the title and price of the 3rd iPhone 15
        String title = thirdPhoneTitle.getText();
        String price = thirdPhonePrice.getText();

        // Print the title and price of the 3rd iPhone 15
        System.out.println("Title of the 3rd iPhone 15: " + title);
        System.out.println("Price of the 3rd iPhone 15: " + price);

        // Close the browser
        driver.quit();
    }
}
