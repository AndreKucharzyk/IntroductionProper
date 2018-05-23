package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions/");

        driver.findElement(By.id("travel_date")).click();
        WebElement dateSwitch = driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch"));
        while(!(dateSwitch.getText().contains("April 2019"))){
            driver.findElement(By.cssSelector(".datepicker-days .next")).click();
        }
        List<WebElement> days = driver.findElements(By.className("day"));
        int numberOfDays = days.size();
        for (WebElement day: days) {
                if (day.getText().equals("15")) {
                    day.click();
                    break;
                }
        }
//        for (int i = 0; i < numberOfDays; i++) {
//            String text = driver.findElements(By.className("day")).get(i).getText();
//            if (text.equals("15")) {
//                driver.findElements(By.className("day")).get(i).click();
//                break;
//            }
//        }


    }
}