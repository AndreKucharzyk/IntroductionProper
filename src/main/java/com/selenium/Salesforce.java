package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesforce {

    public static void main(String[] args) {
        // write your code here


        WebDriver driver = new FirefoxDriver();

        driver.manage().window().setSize(new Dimension(1500,1020));

        driver.get("https:/login.salesforce.com/");

        driver.findElement(By.cssSelector("input#username")).sendKeys("Hello");

        driver.findElement(By.name("pw")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

//        System.out.println(driver.findElement(By.cssSelector("#error")).getText());


    }
}
