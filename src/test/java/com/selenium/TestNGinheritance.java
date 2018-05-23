package com.selenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGinheritance extends TestNGTutorial {

//    @Parameters({"url", "userName"})
    @Test
    public void methodClassThatExtends() {
        System.out.println("class that extends");
        driver.get("https://www.diki.pl/");
    }

    @Test(dataProvider = "getData")
    public void usesDataProvider(String userName, String password) {
        System.out.println(userName + password);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "firstSetUserName ";
        data[0][1] = " psswd";

        data[1][0] = "secondSetUserName ";
        data[1][1] = " secondPassword";

        data[2][0] = "thirdSetUserName";
        data[2][1] = "thirdPassword";

        return data;
    }
}
