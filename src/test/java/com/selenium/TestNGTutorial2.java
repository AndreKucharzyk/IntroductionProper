package com.selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTutorial2 {


    @Test
    public void secondClass() {
        System.out.println("second class testNG");
    }

    //    @BeforeTest
//    public void beforeTestMethod2 () {
//        System.out.println("BeforeTest method2");
//    }
    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("BeforeClass");
    }
}
