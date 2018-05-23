package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadiobuttonsEchoEcho {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();

        driver.get("http://www.echoecho.com/htmlforms10.htm");

//        driver.findElement(By.cssSelector("[value = 'Cheese']")).click();

        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();


    }
}
