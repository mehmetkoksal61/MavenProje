package com.techproed;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Day09_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("http://google.com");
        // Test Case : Google.com'un başlığı "Google Arama Sayfası" olsun.
        String title = driver.getTitle();
        // Google'ın title'ı "Google Arama Sayfası"na eşit mi, değil mi ?
        Assert.assertEquals("Google Arama Sayfası",title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //Assert.assertEquals("Yazı","Google");
    }
    @Test
    public void test2(){
        driver.get("http://amazon.com");
        // Amazon.com'un başlığı Amazon kelimesini içeriyor olsun.
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Amazon"); // "true" ya da "false"
        // boolean veri tipinde bir değer giriyoruz.
        Assert.assertTrue(iceriyorMu);
        //Assert.assertTrue(title.contains("Amazon") ? true : false); seklinde de yazilabilir
    }

    @Test
    public void test3(){
        driver.get("http://facebook.com");

        String title = driver.getTitle();
        // Facebook.com in title si Youtube
        boolean iceriyorMu = title.contains("Youtube"); // "true" ya da "false"

        Assert.assertFalse(iceriyorMu); //False oldugunu dogrula
    }

    @Test
    public void test4(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("MERHABALAR ..");
        Assert.assertEquals("Google Arama Sayfası",title);
        //Eger test basarisizsa bu testin kalan kismini calistirmiyor.
        //Bir sonraki teste atliyor
        System.out.println("TEST DOGRULAMAL ISLEMI BITTI ..");
    }

    @Test
    public void test5(){
        driver.get("http://facebook.com");

        String title = driver.getTitle();
        // Facebook.com in title si Youtube
        boolean iceriyorMu = title.contains("Youtube"); // "true" ya da "false"

        Assert.assertFalse(iceriyorMu); //False oldugunu dogrula
        System.out.println("TEST DOGRULAMAL ISLEMI BITTI ..");
    }

    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
}