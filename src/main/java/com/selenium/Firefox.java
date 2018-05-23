package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();

        driver.get("http://www.spicejet.com/");

//        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//
//        s.selectByValue("2");

        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

        driver.findElement(By.xpath("//a[@value = 'DEL']")).click();

//        driver.findElement(By.xpath("//a[@value = 'DEL']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@value = 'GOI'])[2]")));

        driver.findElement(By.xpath("(//a[@value = 'GOI'])[2]")).click();

//        driver.findElement(By.cssSelector("body")).click();

//        driver.findElement(By.cssSelector("[id = 'ctl00_mainContent_chk_Unmr']")).click();
//
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());



        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // ??????????????????????????????????????

//        driver.findElement(By.xpath("(//a[@value = 'GOI'])[2]")).click();





//        driver.findElement(By.xpath("a[value = 'DEL'][2]")).click();
    }
}
