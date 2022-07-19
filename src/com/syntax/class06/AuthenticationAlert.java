package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {// to pass a username and password for authentification we cann add this in front of the
    // address by model --->username:password@
    // we won't be able to sendKeys() method , above is the only way top handle authentication pop-up
    public static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";// username:password@

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
