package com.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {

   @Test
    public void Test1() throws MalformedURLException {


        WebDriverManager.chromedriver().setup();
        DesiredCapabilities des = new DesiredCapabilities();
        des.setBrowserName(BrowserType.CHROME);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), des);

        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());

        driver.quit();
    }

@Test
    public void Test2() throws MalformedURLException {


        WebDriverManager.chromedriver().setup();
        DesiredCapabilities des = new DesiredCapabilities();
        des.setBrowserName(BrowserType.FIREFOX);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), des);

        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());

        driver.quit();
    }
    @Test
    public void Test3() throws MalformedURLException {


        WebDriverManager.chromedriver().setup();
        DesiredCapabilities des = new DesiredCapabilities();
        des.setBrowserName(BrowserType.EDGE);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), des);

        driver.get("https://www.google.co.in");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
