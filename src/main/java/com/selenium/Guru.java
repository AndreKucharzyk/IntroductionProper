package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Guru {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "G:\\Drive\\Doc Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.demo.guru99.com/V4/");

        driver.findElement(By.cssSelector("[name='uid']")).sendKeys("mngr125330");

        driver.findElement(By.cssSelector("[name='password']")).sendKeys("tasureq");

        driver.findElement(By.cssSelector("[name='btnLogin']")).click();
    }

}



/*    Access details to demo site.
        User ID :	mngr125330
        Password :	tasureq
        This access is valid only for 20 days.
*/