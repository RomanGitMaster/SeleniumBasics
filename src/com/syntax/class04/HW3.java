package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
       WebElement username= driver.findElement(By.cssSelector("input#txtUsername"));
       username.sendKeys("Admin");
       driver.findElement(By.id("btnLogin")).click();
       WebElement messageDisplay=driver.findElement(By.cssSelector("span#spanMessage"));
       if(messageDisplay.isDisplayed()){
           System.out.println("PASSWORD CANNOT BE EMPTY verified");
       }else{
           System.out.println("PASSWORD CANNOT BE EMPTY is not verified ");
       }
       driver.quit();
    }
}
