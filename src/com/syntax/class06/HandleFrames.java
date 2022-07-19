package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);//switching to frame by name or id using switchTo() method
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Run Aladdin, Run!");

        driver.switchTo().defaultContent();// switching back to main html, quiting frame
        Thread.sleep(3000);
        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();// after we regain focus automatically on webpage
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.switchTo().frame("iframe_a");//switching to frame by name or id
        textbox.clear();// we need to clear the text we typed before
        textbox.sendKeys("abrakadabra");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Try arabian tea");


    }
}