package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    Go to facebook sign up page
    Fill out the whole form
    Click signup
     */
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Aladdin");
        driver.findElement(By.name("lastname")).sendKeys("Ababua");
        driver.findElement(By.name("reg_email__")).sendKeys("AladdinFromAgraba@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("AladdinFromAgraba@yahoo.com");
        driver.findElement(By.id("password_step_input")).sendKeys("RabTheLamp");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("day")).sendKeys("30");
        driver.findElement(By.id("year")).sendKeys("2005");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}