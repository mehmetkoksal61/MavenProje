package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IlkOrnek {

    static WebDriver driver;
    // neden burada tanımladık ?
    // çünkü, diğer merhodlardan da, yani tüm merhodlardan bu nesneye erişmek istiyoruz.
    // çünkü, findElement gibi methodları ister istemez test'lerin içerisnde kullanağız.
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        // Google.com'a gideceğim.
        // Sayfanın title'na bakacağım. Google kelimesi geçiyorsa, testim başarılı.
        driver.get("http://google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();

    }

}
