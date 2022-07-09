package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*
Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Simple Form Demo']/parent::div")).click();
        WebElement message= driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("ABUBUA");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
