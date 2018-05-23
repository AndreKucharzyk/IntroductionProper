package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestNGTutorial {

    public static WebDriver driver;
    Properties properties = new Properties();
    FileInputStream fileInputStream;

    {
        try {
//            properties = Thread.currentThread().getContextClassLoader().getResourceAsStream("testData/dataddriven.properties");
            fileInputStream = new FileInputStream("C:\\Selenium\\Projects\\IntroductionProper_21_05\\IntroductionProper\\src\\test\\java\\testData\\dataddriven.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @BeforeSuite
    public void Login() {
        System.out.println("BeforeSuiteMethod");
        try {
            properties.load(fileInputStream);
            System.out.println(properties.get("username"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeTest
    public void setup() {
        if (properties.get("browser").equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Before test method chrome");
        } else if (properties.get("browser").equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Before test method firefox");
        }

//    @AfterClass
//    protected void tearDown(){
//        driver.close();
//    }

//    @Test
//    public void demo2() {
//        System.out.println("first class second method");
//    }

//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("BeforeMethod");
//    }

//    @BeforeTest
//    public void beforeTestMethod () {
//        System.out.println("BeforeTest");
//    }

//    @AfterTest
//    public void afterTestMethod () {
//        System.out.println("AfterTest method");
//    }
    }
}