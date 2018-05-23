package com.selenium;

import org.testng.annotations.Test;

public class StaticVariableTest2 {

    @Test
    public void staticVariableTest2() {
//        TestNGTutorial.setup();
        TestNGTutorial.driver.get("https://www.youtube.com/watch?v=hq6rLnQ9yQI");
    }
}
