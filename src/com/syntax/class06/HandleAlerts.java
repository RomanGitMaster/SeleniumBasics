package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static String url="http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        Alert simpleAlert=driver.switchTo().alert();// switch our focus to alert
        simpleAlert.accept();

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert= driver.switchTo().alert();
        String confirmAlertText=confirmAlertButton.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss();

        WebElement promtAlertButton=driver.findElement(By.id("promt"));
        promtAlertButton.click();
        Alert promtAlert= driver.switchTo().alert();
        promtAlert.sendKeys("Rub the Lamp Aladdin");
        promtAlert.accept();


    }
}
