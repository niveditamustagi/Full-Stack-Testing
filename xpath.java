package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.Firefox.driver", "path/to/your/Firefoxdriver");

        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();

        // Open the browser to the specified URL
        String url = "https://v1.training-support.net/selenium/login-form";
        driver.get(url);

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        // Find the username field using xpath and enter "admin" into it
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("admin");

        // Find the password field using xpath and enter "password" into it
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("password");

        // Find the "Log in" button using xpath and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}