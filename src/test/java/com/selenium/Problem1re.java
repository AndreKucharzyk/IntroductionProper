package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Problem1re {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/recaptcha/api2/demo");
        try {
            WebElement webElement1 = webElementOnFrame(driver, By.className("recaptcha-checkbox-checkmark"));
            webElement1.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.switchTo().defaultContent();
        try {
            WebElement webElement2 = webElementOnFrame(driver, By.id("recaptcha-verify-button"));
            webElement2.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ADD SEARCHING FOR FRAME IN FRAME!
    public static int elementFrameIndex(WebDriver driver, By by) {
        List<WebElement> iframesList = driver.findElements(By.tagName("iframe"));
        int i = 0;
        for (WebElement frame : iframesList) {
            driver.switchTo().frame(i);
            List<WebElement> element = driver.findElements(by);
            if (element.size() > 0) {
                driver.switchTo().defaultContent();
                return i;
            }
            i++;
            driver.switchTo().defaultContent();
        }
        return -1;
    }

    //ADD SEARCHING FOR FRAME IN FRAME!
    public static WebElement webElementOnFrame(WebDriver driver, By by) throws Exception {
        List<WebElement> iframesList = driver.findElements(By.tagName("iframe"));
        int i = 0;
        for (WebElement frame : iframesList) {
            driver.switchTo().frame(i);
            List<WebElement> element = driver.findElements(by);
            if (element.size() > 0) {
                return driver.findElement(by);
            }
            i++;
            driver.switchTo().defaultContent();
        }
        throw new Exception();

    }

//    public static WebElement webElementOnFrame(WebDriver driver, By by) throws Exception {
//        List<WebElement> iframesList = driver.findElements(By.tagName("iframe"));
//        int i = 0;
//        for (WebElement frame: iframesList) {
//            driver.switchTo().frame(i);
//            if (driver.findElements(By.tagName("iframe")).isEmpty() == true) {
//                List<WebElement> element = driver.findElements(by);
//                if (element.size() > 0) {
//                    return driver.findElement(by);
//                }
//                i++;
//                driver.switchTo().defaultContent();
//            }
//        }
//        throw new Exception();
//    }
}

