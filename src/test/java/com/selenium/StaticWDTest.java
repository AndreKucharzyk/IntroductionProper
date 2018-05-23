package com.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StaticWDTest {

    @Test
    public static void testStaticVariable() {
        TestNGTutorial.driver.findElement(By.cssSelector(".startLearningButton")).click();
    }
}
