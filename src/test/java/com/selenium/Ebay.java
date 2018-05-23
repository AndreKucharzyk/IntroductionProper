package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ebay {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        System.out.println(driver.findElements(By.tagName("a")).size());
//        WebElement footer = driver.findElement(By.xpath(".//*[@id = 'glbfooter']"));
//        System.out.println(footer.findElements(By.tagName("a")).size());
        System.out.println(driver.findElement(By.xpath(".//*[@id = 'glbfooter']")).findElements(By.tagName("a")).size());
        //powyżej to samo co poniżej
        System.out.println(driver.findElements(By.xpath(".//*[@id = 'glbfooter']//a")).size());

        List<WebElement> linksSubsection = driver.findElements(By.xpath(".//table[@class = 'gf-t']" +
                "//td[2]/ul/li[@class = 'gf-li']//a"));
        String title1 = null;
        String title2;
        System.out.println(linksSubsection.size());
        for (WebElement aLinksSubsection : linksSubsection) {
            System.out.println(aLinksSubsection.getText());
            if (aLinksSubsection.getText().contains("Site map")) {
                title1 = driver.getTitle();
                System.out.println(title1);
                aLinksSubsection.click();
                System.out.println(driver.getWindowHandle());
                break;
//                linksSubsection.get(i).click();
//                driver.findElement(By.cssSelector("[href='https://pages.ebay.com/sitemap.html']")).click();
            }
        }
        System.out.println(title2 = driver.getTitle());
        System.out.println(driver.getWindowHandle());
//        org.testng.Assert.assertNotEquals(title1, title2);
        if ((title1 != title2) && driver.getPageSource().contains("eBay User Tools")) {

            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}