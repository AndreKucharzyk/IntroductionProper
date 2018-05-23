package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttons {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");

        driver.findElement(By.xpath("//input[@value = 'male']")).click();
    }
}
