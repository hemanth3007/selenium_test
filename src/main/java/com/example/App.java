package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary("/usr/bin/google-chrome");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        opt.addArguments("--headless");
        opt.addArguments("--no-sandbox");
        opt.addArguments("--disable-dev-smh-usage");
        opt.addArguments("--disable-gpu");
        opt.addArguments("--windows-size=1920,1080");
        
        WebDriver dr = new ChromeDriver(opt);
        dr.get("https://www.saucedemo.com");
        dr.manage().window().maximize();
        System.out.println("\n\n"+dr.getTitle()+"\n\n");
        dr.findElement(By.id("user-name")).sendKeys("standard_user");
        dr.findElement(By.id("password")).sendKeys("secret_sauce");
        dr.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        dr.quit();
    }
}
