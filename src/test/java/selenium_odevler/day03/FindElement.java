package selenium_odevler.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Techproeducation sayfasına gidelim
        //Çıkan reklamı locate edip kapatalım
        //Arama bölümünde qa aratalım
        //Sayfa başlığının qa içerdiğini doğrulayalım
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        //Carrer Opportunities In QA linkine tıklayalım
        //Başlığın Opportunities içerdiğini test edelim
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım

        driver.get("https://www.techproeducation.com/");
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@id='elementor-search-form-9f26725'])[1]")).sendKeys("QA", Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "QA";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Tested PASSED");
        } else {
            System.out.println("Tested FAILED");
        }
        WebElement qa = driver.findElement(By.xpath("(//*[@href=' https://techproeducation.com/software-career-opportunities-qa/'])[1]"));

    }
}
