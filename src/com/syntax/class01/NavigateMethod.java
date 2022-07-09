package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.navigate().to("https://google.com");//similar to method .get() but allows us go back and forward
        driver.navigate().back();// since we moved back option to move forward is open
        driver.navigate().forward();
        Thread.sleep(2000);// PAUSE refresh of the page for 2000milliseconds=2 sec(learn seconds scale system!)
        driver.navigate().refresh();
        //driver.quit();// close only current Tab
        driver.close();// closes the whole Browser




    }
}
