package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "G:\\Drive\\Doc Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://rediff.com");

        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

        driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("hello");

        driver.findElement(By.cssSelector("#password")).sendKeys("pswd");

        driver.findElement(By.cssSelector("input[name*='ceed'")).click();

//        driver.close();
    }
}
