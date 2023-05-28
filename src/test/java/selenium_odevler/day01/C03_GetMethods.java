package selenium_odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {
        /*
Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.*/

        System.setProperty("webdeiver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfa basligini(title) yazdirin
        System.out.println("Amazon actual title " + driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String title = driver.getTitle();
        if (title.contains("Amazon")){
            System.out.println("Title PASSED");
        }else System.out.println("Test Failed");
        //Sayfa adresini(url) yazdirin
        System.out.println("Amazon actual url : " + driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("URL PASSED");
        }else System.out.println("Test Failed");
        //Sayfa handle degerini yazdirin
        System.out.println("Amazon actual handle : " + driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("Gateway Test PASSED");
        }else System.out.println("Gateway Test Failed");

        driver.close();
    }
}
