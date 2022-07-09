package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    Open amazon.com print  title and url and then quit browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com ");
        String title1=driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(title1+" "+url);
        driver.quit();

    }
}
