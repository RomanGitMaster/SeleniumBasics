package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        //https://www.syntaxprojects.com/basic-checkbox-demo.php
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";
        driver.get(url);
        List<WebElement> optionCheckBoxes=driver.findElements(By.xpath("//input[@class = 'cb1-element']"));// we mus t select all similar options elements
        int size = optionCheckBoxes.size();
        System.out.println(size);

        for(WebElement option:optionCheckBoxes){
            String checkBoxValue= option.getAttribute("Value");
            if(checkBoxValue.equals("Option-2")){
                option.click();
                break;
            }
        }



    }
}
