package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Ali");
        driver.findElement(By.id("customer.lastName")).sendKeys("Ababua");
        driver.findElement(By.name("customer.address.street")).sendKeys("Palace street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Agraba City");
        driver.findElement(By.name("customer.address.state")).sendKeys("Padishah state");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("Lamp, connect me to Gynie");
        driver.findElement(By.name("customer.ssn")).sendKeys("54321");
        driver.findElement(By.id("customer.username")).sendKeys("Aladdin");
        driver.findElement(By.name("customer.password")).sendKeys("Abu");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Abu");
        driver.findElement(By.partialLinkText("Register")).click();
        Thread.sleep(2000);
        driver.quit();


    }

}

