package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class TestNGTutorial3 {


    @Test
    public void webLogin() {
        System.out.println("third class method 1");
    }

    @Test
    public void mobileLogin() {
        System.out.println("third class method 2");
    }

    @Test
    public void loginAPIcarLoan() {
        System.out.println("third class method 3");
    }
}
