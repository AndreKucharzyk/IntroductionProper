package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchingWindows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.cssSelector("[href = 'https://support.google.com/accounts?hl=en']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
        String[] handles = driver.getWindowHandles().toArray(new String[0]);
//        System.out.println(handles.size());
//        Iterator<String> iteration = handles.iterator();
//        String first = iteration.next();
        System.out.println(handles.length);
        System.out.println(handles[0]);
        System.out.println(handles[1]);
        driver.switchTo().window(handles[1]);
        System.out.println(driver.getTitle());
    }
}