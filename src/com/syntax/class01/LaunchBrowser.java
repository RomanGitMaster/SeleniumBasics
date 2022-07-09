package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // letting selenium know what webdriver we will be using

        //WebDriver is an Interface ( inside of interfaces there is no implemented methods, they all abstract, no body of a code)
        WebDriver driver = new ChromeDriver();// launch the browser an only that, next we have to specify actions, we use
        // methods for that
        driver.get("http://google.com");
        String url=driver.getCurrentUrl();// to get that url in form of a String
        System.out.println(url);// printing that url in for of a String

        String title=driver.getTitle();// title is displayed on a tab( window) that we work on  a web, so if we opened google.com title will be Google
        System.out.println(title);
        driver.quit();// quits our session or browser



    }
}
