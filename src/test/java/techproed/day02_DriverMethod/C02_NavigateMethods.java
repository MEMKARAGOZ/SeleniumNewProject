package techproed.day02_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(3000);
        // Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        // Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfa basligi " + driver.getTitle());
        Thread.sleep(3000);
        // Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
        // Sayfa başlığını yazdıralım
        System.out.println("Techproeducation sayfa basligi " + driver.getTitle());
        Thread.sleep(3000);
        // Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Amazon Sayfa Url'si = " + driver.getCurrentUrl());
        // Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);
        //Sayfayi kapatalim
        driver.close();


    }
}
