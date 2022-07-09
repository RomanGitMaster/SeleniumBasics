package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static void main(String[] args) {
        //1. set a system property
        // use this path for mac
        //System.setProperty("webdriver.chrome.driver","/Users/Ro/IdeaProjects/SeleniumBatch13/drivers/chromedriver");
        // use this for windows( must use extension .exe for our driver
        System.setProperty("webdriver.chrome.driver","/Users/Ro/IdeaProjects/SeleniumBatch13/drivers/chromedriver.exe");//or just "drivers/chromedriver.exe"

        //2.create an object of webdriver type
        WebDriver driver=new ChromeDriver();

        //3.Navigate to any application(website) Syntax.com for example or Google.com
        driver.get("http://google.com");//get waits until page is loaded until proceed with other commands

        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
