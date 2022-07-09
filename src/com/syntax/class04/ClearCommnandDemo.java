package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//QUICK EXAMPLE HOW WE CLEAR TEXTBOXES WITH FILLED OUT INFORMATION
public class ClearCommnandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));// we are getting element of the value we are trying to find
        // and reuse it--> code reuse
        username.sendKeys("Tester");// makes code cleaner and more readable
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        Thread.sleep(2000);
        username.clear();
        password.clear();

    }
}