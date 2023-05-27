package techproed.day02_DriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.deriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = " + driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50, 50));
        driver.manage().window().setSize(new Dimension(600, 600));
        Thread.sleep(3000);
        Thread.sleep(3000);
        //sayfayi kapatiniz
        driver.close();
        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer web elementidir.
        // Bunlarin butunu web sayfasini olusturur.
        //Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
        // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
        // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
        // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder
    }
}
