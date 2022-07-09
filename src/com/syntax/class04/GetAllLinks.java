package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//HERE WE TRYING TO FIND ALL DIFFERENT LINKS THAT ARE BEING DISPLAYED ON A WEBPAGE
public class GetAllLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        driver.manage().window().maximize();
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+allLinks.size());
        for(WebElement link:allLinks){
            String linkText= link.getText();
            String fullLink=link.getAttribute("href");// we adding links too to the linkText
            if (!linkText.isEmpty()) {// we specify to print only links with the text and skip everything else
                System.out.println(linkText+" "+fullLink);
            }
        }


    }
}