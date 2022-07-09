package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicsOfSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntax.com/basic-first-form-demo.php");
        // try to avoid attribute's values with spaces
        driver.findElement(By.linkText("Start Practicing"));// its different with linkText and partialLinkText
        Thread.sleep(2000);
        //get all links
        List<WebElement> links=driver.findElements(By.tagName("a"));

    }
}
