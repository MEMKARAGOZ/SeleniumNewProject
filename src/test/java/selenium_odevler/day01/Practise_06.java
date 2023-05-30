package selenium_odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practise_06 {
    public static void main(String[] args) {
 /*
 ODEV
Yeni bir class olusturun (TekrarTesti)
 Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
 eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
Daha sonra Amazon sayfasina gidin https://www.amazon.com/
Youtube sayfasina geri donun
Sayfayi yenileyin
Amazon sayfasina donun
Sayfayi tamsayfa yapin
Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
Sayfayi kapatin
         */
        System.setProperty("chromedriver", "src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(" https://www.youtube.com/ ");

        if (driver.getTitle().contains("youtube")) {
            System.out.println("Test PASSED");
        } else System.out.println(driver.getTitle());

        if (driver.getCurrentUrl().contains("youtube")) {
            System.out.println("Test PASSED");
        } else System.out.println(driver.getCurrentUrl());

        driver.get("https://www.amazon.com/");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.manage().window().fullscreen();

        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Test PASSED");
        } else System.out.println(driver.getTitle());

        if (driver.getCurrentUrl().contains("https://www.amazon.com/")) {
            System.out.println("Test PASSED");
        } else System.out.println(driver.getCurrentUrl());

        driver.close();


    }


}


