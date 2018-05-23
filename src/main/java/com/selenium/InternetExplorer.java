package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

    public static void main(String[] args) {
        // write your code here

        System.setProperty("webdriver.ie.driver",
                "G:\\Drive\\Doc Selenium\\MicrosoftWebDriver\\MicrosoftWebDriver.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
