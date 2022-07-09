package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*  navigate to fb.com
      click on create new account
      fill up all the textboxes
      click on sign up button
      close the pop up
      close the browser

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Ali");
        driver.findElement(By.name("lastname")).sendKeys("Ababua");
        driver.findElement(By.name("reg_email__")).sendKeys("cave.wonders@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("cave.wonders@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("MagicCarpet");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("day")).sendKeys("15");
        driver.findElement(By.id("year")).sendKeys("2000");
        driver.findElement((By.xpath("//label[text()='Male']"))).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.quit();


    }
}
