package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WdFirefox {


    static WebDriver driver;

//    public WebDriver driver;
//
//    public WdFirefox() {
//        driver = new FirefoxDriver();
//    }

    public static void start() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dre\\Dropbox\\Doc Selenium\\Drivers\\geckodriver-v0.20.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
    }


}
