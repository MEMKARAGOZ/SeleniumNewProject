package techproed.day03_Lacotors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
/*
// https://www.amazon.com sayfasına gidiniz
// aramakutusunu locate ediniz ve Nutella aratınız
// sayfayı kapatınız

 */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.com");

        //amazon sayfasi arama cubugunda inspect yaptik ve HTML kodunda id'yi gorunce onu sectik.id'nin
        //value'sinin uzerine gelip iki kez tikladik. CTRL C, CTRL F sonrasinda en altta acilan cubuga
        //CTRL F ile aldigimiz kismi yapistirdik. Bunu By.id()parantezi icine yerlestirdik.

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //Bu yöntem, bir web sayfasındaki bir metin giriş alanına veri göndermek için kullanılır.


        //Biz parantez icine sadece Nutella yazinca eksik kalir. Biz web sayfasinda
        //manual olarak yazdigimiz Nutella icin enter'a basarsak onu goruruz. Manual olarak
        //enter'a basmayi parantez icinde +Keys.ENTER eklemesi ile enter islemini otomasyon ile
        //tamamlamis olduk.

        //soyle de yapabilirdik:
        //driver.findElement(By.id(twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        //Eger bir webelemt'i birden fazla kullanmayacaksaniz bir webelement'e assign etmeyebiliriz.
        //Sonradan kullanacaksak assign etmeliyiz.

        Thread.sleep(2000); //asker gibi kapida bekler, iki saniye bekle derseniz, o kadar sure
        //kodlarinizi bekletir.

        driver.close();



    }

}