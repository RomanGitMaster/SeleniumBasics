package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //For Expath we need to locate our element in our DOM
        WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));//  \"password"\or this
        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[contains(@value,'Login')]"));//
        login.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
