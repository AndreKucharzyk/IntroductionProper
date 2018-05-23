package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Table {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com");

        driver.findElement(By.linkText("Live Scores")).click();
        driver.findElement(By.linkText("DD vs SRH - SRH Won")).click();
        driver.findElement(By.linkText("Scorecard")).click();
        List<WebElement> table = driver.findElements(By.cssSelector
                ("#innings_1 .cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1) .cb-col.cb-col-100.cb-scrd-itms .cb-col.cb-col-8.text-right.text-bold"));
        table.size();
//        for (WebElement cell : table) {
//            System.out.println(cell.getText());
//        }
        int sumOfScore = 0;
        for (int i = 0; i < table.size() - 1; i++) {
            int singleScore = Integer.parseInt(table.get(i).getText());
            sumOfScore += singleScore;
        }
        String sumString = driver.findElement(By.xpath("//*[text() = 'Total']/following-sibling::div")).getText();

        if (sumOfScore == Integer.parseInt(sumString)) {
            System.out.println("GG");
        }
    }
}