package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        /*
        driver.findElement(By.name("firstname")).sendKeys("Aladdin");
        driver.findElement(By.name("lastname")).sendKeys("Ababua");
        driver.findElement(By.name("reg_email__")).sendKeys("AladdinFromAgraba@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("AladdinFromAgraba@yahoo.com");
        driver.findElement(By.id("password_step_input")).sendKeys("RabTheLamp");

         */

       WebElement monthDD=driver.findElement(By.id("month"));
        Select select=new Select(monthDD);
        List<WebElement>alloptionsM=select.getOptions();
        int sizeMonthDD=alloptionsM.size();
        if (sizeMonthDD==12){
            System.out.println("All month options are verified: "+sizeMonthDD);
        }else{
            System.out.println("All month options were not verified");
        }
        select.selectByIndex(1);

        WebElement dayDD= driver.findElement(By.id("day"));
        Select select1=new Select(dayDD);
        List<WebElement>alloptionsDays=select1.getOptions();
        int sizeDays=alloptionsDays.size();
        if(sizeDays==31){
            System.out.println("All days options are verified: "+sizeDays);
        }else{
            System.out.println("All days options were not verified");
        }
        select1.selectByVisibleText("30");

        WebElement yearDD= driver.findElement(By.id("year"));
        Select select2=new Select(yearDD);
        List<WebElement>alloptionsYears=select2.getOptions();
        int sizeYears=alloptionsYears.size();
        if (sizeYears==118){
            System.out.println("All years options were verified: "+sizeYears);
        }else{
            System.out.println("All days options were not verified");
        }
        select2.selectByValue("2005");

        Thread.sleep(2000);
        driver.quit();











    }
}
