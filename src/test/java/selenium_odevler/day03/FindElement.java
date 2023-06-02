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
        driver.get("https://www.techproeducation.com/");
        //Çıkan reklamı locate edip kapatalım
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(3000);
        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("(//*[@id='elementor-search-form-9f26725'])[1]")).sendKeys("QA", Keys.ENTER);
        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualTitle = driver.getTitle();
        String expectedTitle = "QA";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Tested PASSED");
        } else {
            System.out.println("Tested FAILED");
        }
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement qaLink = driver.findElement(By.xpath("//*[@class='elementor-post__thumbnail__link'][1]"));
        if (qaLink.isDisplayed()){
            System.out.println("Carrer Opportunities In QA linki görünür");
        }else System.out.println("Carrer Opportunities In QA linki görünür degil");
        if (qaLink.isEnabled()){
            System.out.println("Carrer Opportunities In QA linkinin erisilebilir");
        }else System.out.println("Carrer Opportunities In QA linkinin erisilebilir degil");
        //Carrer Opportunities In QA linkine tıklayalım
        qaLink.click();
        //Başlığın Opportunities içerdiğini test edelim
        String expectedTitleQA = "Opportunities";
        String actualTitleQA = driver.getTitle();
        if (actualTitleQA.contains(expectedTitleQA)) {
            System.out.println("Tested SUCCESSFUL");
        }else System.out.println("Tested FAILED ");
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        if (driver.getCurrentUrl().contains("https://techproeducation.com/")){
            System.out.println("Tested PASSED");
        }else System.out.println("Tested FAILED");
    }
}
