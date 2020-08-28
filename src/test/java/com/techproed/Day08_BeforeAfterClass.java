package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {

    @BeforeClass // Bu annotiona sahip method her clas calismdan once calisir
    public static void setUp(){
        System.out.println("setUp calisti");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 calisti");
    }

    @AfterClass //Bu annotiona sahip method her clas calisdiktan sonra calisir
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }
}
