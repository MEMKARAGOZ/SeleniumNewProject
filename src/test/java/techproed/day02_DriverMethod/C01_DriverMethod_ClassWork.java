package techproed.day02_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethod_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.deriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

//Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Url`nin https://www.amazon.com oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED"+actualUrl);

        //Sayfayı kapatalım
        driver.close();//Browser'ı kapatır
        // driver.quit();-> Birden fazla browser varsa hepsini kapatır.


    }
}
