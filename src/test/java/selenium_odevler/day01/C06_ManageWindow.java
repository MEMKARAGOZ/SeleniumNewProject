package selenium_odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdeiver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin
         */
        // 2.Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3.Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Amazon Sayfasinin  Konumu ve Boyutlatlari : " + driver.manage().window().getPosition()
                + driver.manage().window().getSize());
        //4.Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // 6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Amazon Sayfasinin Max  Konumu ve Boyutlatlari : " + driver.manage().window().getPosition()
                + driver.manage().window().getSize());
        // 7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        // 8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Amazon Sayfasinin Fullscreen  Konumu ve Boyutlatlari : " + driver.manage().window().getPosition()
                + driver.manage().window().getSize());
        // 9.Sayfayi kapatin
        driver.quit();
        // 10.


    }
}
