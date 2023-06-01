package techproed.day05_XpathcssSelector_NT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com/");
        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][1]"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        Thread.sleep(3000);
        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[@href='/s?k=hybrid+bike&ref=sr_nr_p_rk_sp_0']")).click();
        Thread.sleep(3000);
        // sonuc sayısını yazdırın
        System.out.println(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small'][1]")).getText());
        Thread.sleep(3000);
        // ilk ürününe tıklayın
       WebElement ilkUrun = driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal'][1]"));
       Thread.sleep(3000);
       ilkUrun.click();
        // Sayfayı kapatınız
        driver.close();

    }
}
