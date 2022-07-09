package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//EXAMPLE OF WORK WITH RAIO BUTTONS AND HOW WE IDENTIFY AND CHECK THEM
public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton=driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean isAgeRadioButtonEnabled=ageRadioButton.isEnabled();// enabled means we can perform action on that element
        System.out.println(isAgeRadioButtonEnabled);
        boolean isAgeRadioButtonDisplayed=ageRadioButton.isDisplayed();// sometimes element on a Dom may not be displayed on a webpage
        System.out.println(isAgeRadioButtonDisplayed);
        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();// check if radiobutton is selected or not
        System.out.println("Before clicking"+" "+isAgeRadioButtonSelected);//false, we didn't click on it yet
        ageRadioButton.click();
        isAgeRadioButtonSelected=ageRadioButton.isSelected();// we have to assign new  value since previous
        // isAgeRadioButtonSelected was false, and  java will read previous variable, even after performing action of click();
        System.out.println("After clicking"+ " "+isAgeRadioButtonSelected);


    }
}
