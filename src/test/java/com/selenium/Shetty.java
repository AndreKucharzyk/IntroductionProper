package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shetty {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C://Users//jeets//Documents//My Others//TestingPractice//Drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/recaptcha/api2/demo");
        int number=switchtoFramenumber(driver,By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"));
        driver.switchTo().frame(number);
//Clocking on found frame I am not Robit
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
    }
    public static int switchtoFramenumber(WebDriver driver,By by)
    {
//Searching how many frames on page Then
        int i;
        int framecount=driver.findElements(By.tagName("iframe")).size();
        for (i=0;i<framecount;i++) {
            driver.switchTo().frame(i);
// Then going to I am not Robit and find simply xpath and searcing if this frame is present or NOT
            int count =driver.findElements(by).size();
            if(count>0)
            {
                break;
            }
            else
            {
                System.out.println("continue looping");
            }
        }
        driver.switchTo().defaultContent();
        return i;
    }

}