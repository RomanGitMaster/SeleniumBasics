package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.facebook.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String expectedTitle="Facebook - log in or sign up";
        if( title.equalsIgnoreCase(expectedTitle)){
            System.out.println("title is correct");
        }else{
            System.out.println("title is not correct");
        }
        driver.quit();


    }
}