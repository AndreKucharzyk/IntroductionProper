package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookxpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

//        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myownxpath");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email txt");
//        driver.findElement(By.cssSelector("[value='Log In']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).getText();
//        driver.findElement(By.cssSelector("[value='Log In']")).click();

    }
}
