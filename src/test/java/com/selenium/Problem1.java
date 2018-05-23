package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Problem1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/recaptcha/api2/demo");

//        String[] arrayWithType = new String[2];
//        arrayWithType[0] = "whatever";
//        arrayWithType[1] = "whatever1";
//        System.out.println(arrayWithType[1]);
        int iframesBefore = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
        int iframesAfter = driver.findElements(By.tagName("iframe")).size();
        driver.findElement(By.id("recaptcha-verify-button")).click();
    }
}