package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@kjfngjas.com");// its case sensitive, make sure you type as it's written on a webpage html doc
        driver.findElement(By.id("pass")).sendKeys("abrakadabra");
        driver.findElement(By.name("login")).click();// we just click on an element of the login button of the webpage .click() method is used here
        Thread.sleep(2000);
       // driver.findElement(By.linkText("Forgot password?")).click();// sometimes our code is running faster than application(fb.com in our case)
                                                                    // so we need to give a pause between the actions(methods) in our case before
                                                                    // clicking Forgot Password
        driver.findElement(By.partialLinkText("Forgot")).click();


    }
}
