package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        //access the text box surname using absolute xPath
        WebElement surName = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surName.sendKeys("Dupovski");
        WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
        firstName.sendKeys("Dupa");

        //Access the Webelement date of birth and print the text on console
        WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());
        // Access the webelement license and print
        WebElement licence = driver.findElement(By.xpath("//label[contains(text(),\"Licence Period\")]"));
        System.out.println(licence.getText());

        // access the webelement radiobutton and click on iy
        WebElement radioButton = driver.findElement(By.xpath("//label[text()='Full']/following-sibling::input"));
        radioButton.click();

        // access the textbox phone number and send in the number
        WebElement phoneNumb = driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumb.sendKeys("+923457307222222");

        // access the webelement address and send in the address
        WebElement address = driver.findElement(By.cssSelector("input[id*='attributes_street']"));
        address.sendKeys("paksitan");
    }
}
