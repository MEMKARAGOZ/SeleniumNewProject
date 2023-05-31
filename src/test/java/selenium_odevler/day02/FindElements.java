package selenium_odevler.day02;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;


public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        //Amazon sayfasına gidiniz
        //iphone aratınız
        //çıkan sonuç yazısını konsola yazdırınız
        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://wwww.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" + Keys.ENTER);
        Thread.sleep(2000);
        List<WebElement> sonuclar = driver.findElements(By.className("sg-col-inner"));
        WebElement yazi =  sonuclar.get(0);
        System.out.println("yazi.getText() = " + yazi.getText());



       List< WebElement> sonucListesi;
        sonucListesi =  driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
        int ilkBesUrun = Math.min(5, sonucListesi.size());

        for (int i = 0; i < ilkBesUrun; i++) {
            WebElement urun = sonucListesi.get(i);
            urun.click();
            System.out.println("Sayfa basligi " +driver.getTitle());
            driver.navigate().back();
        }


       }

    }

