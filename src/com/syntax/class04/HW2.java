package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    /*
     Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Here are the all the links: "+allLinks.size());
        for (WebElement allLink : allLinks) {
            String textlinks = allLink.getText();
            String links = allLink.getAttribute("href");
            if (!textlinks.isEmpty()) {
                System.out.println(textlinks+" "+links);
            }


        }


    }
}