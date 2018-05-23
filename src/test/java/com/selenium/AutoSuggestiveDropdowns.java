package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropdowns {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ksrtc.in/oprs-web");

        driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        System.out.println(jse.executeScript(script) instanceof String);
        String text = (String) jse.executeScript(script);
        System.out.println(text);
//        System.out.println(jse.executeScript(script));
        Object object;
    }
}