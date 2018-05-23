package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronisation {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://alaskatrips.poweredbygps.com/");

        driver.findElement(By.cssSelector(".icon-hotels")).click();

        driver.findElement(By.cssSelector("#hotel-destination")).sendKeys("nyc");

        driver.findElement(By.cssSelector("#hotel-destination")).sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector("#hotel-checkin")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[target = '4182702']")));

        driver.findElement(By.cssSelector("[target = '4182702']")).click();

    }
}


