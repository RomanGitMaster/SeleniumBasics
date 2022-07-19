package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3 {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD = driver.findElement(By.id("gh-cat"));
        // categoriesDD.click();
        Select select = new Select(categoriesDD);
        List<WebElement> options = select.getOptions();
        int size = options.size();
        System.out.println("categories size is " + size);
        for (int i = 1; i < size; i++) {
            String option = options.get(i).getText();
            System.out.println(option);
        }
        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        Thread.sleep(1000);
        WebElement header = driver.findElement(By.xpath("//span[text()='Computers, Tablets & Network Hardware']/parent::h1"));
        if (header.isDisplayed()) {
            System.out.println("Computers/Tablets & Networking Header is displayed");
        } else {
            System.out.println("Computers/Tablets & Networking Header is not displayed");
        }
    }
}
