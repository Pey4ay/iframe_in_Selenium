package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class IframeTest {
    private WebDriver driver;


    @Test
    public void test() throws Exception {
        driver = new ChromeDriver();
        driver.get("your URL");
        //Store the web element
        WebElement iframe = driver.findElement(By.xpath("xpath or cssSelector to your iframe"));
        driver.switchTo().frame(iframe);
    }
}