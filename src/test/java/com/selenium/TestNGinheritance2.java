package com.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestNGinheritance2 extends TestNGTutorial {

    @Test/*(dependsOnMethods = "methodClassThatExtends")*/
    public void methodClassThatExtends2() {
        driver.findElement(By.linkText("Kurs angielskiego online")).click();
    }
}