package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("input[type = 'text']"));
        username.sendKeys("Admin");
        WebElement pass = driver.findElement(By.cssSelector("input[type = 'password']"));
        pass.sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        WebElement logo = driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));
        if (logo.isDisplayed()) {
            System.out.println("Logo verified");
        } else {
            System.out.println("No Logo displayed");
        }
        Thread.sleep(1000);
        driver.quit();
    }
}

