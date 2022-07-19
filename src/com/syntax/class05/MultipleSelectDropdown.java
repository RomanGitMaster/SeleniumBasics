package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class MultipleSelectDropdown {
    static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get(url);
        WebElement statesDD=driver.findElement(By.id("multi-select"));
        Select select=new Select(statesDD);// in order to interact and manipulate the options in a dropdown we need a Select class
        select.isMultiple();// a method to check if our dropdown is multiple select or not
        boolean isMultiple= select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple) {
            List<WebElement> options = select.getOptions();// without Select class we are not able yto get method .getOptions();
            for (WebElement option : options) {
                String optionText = option.getText();// assigning texts from every option of dropdown to String optionText
                select.selectByVisibleText(optionText);//printing out these option texts
            }
        }

        // as well as select we can dissect the elements by using these methods:
        select.deselectByIndex(5);
        select.deselectAll();
    }
}