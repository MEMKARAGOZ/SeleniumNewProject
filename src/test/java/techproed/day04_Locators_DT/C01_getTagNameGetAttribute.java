package techproed.day04_Locators_DT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //https://www.amazon.com sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //arama kutusunun tagName'ini "input" oldugunu test edin
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Tested PASSED");
        } else {
            System.out.println("Tested FAILED");
        }
        //arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        String actualAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";
        if (actualAttribute.equals(expectedAttribute)) {
            System.out.println("Tested PASSED");
        } else
            System.out.println("Tested FAILED");
        //sayfayi kapatin
        driver.close();

    }
}
