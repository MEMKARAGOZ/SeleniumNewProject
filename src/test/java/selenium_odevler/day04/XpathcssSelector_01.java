package selenium_odevler.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathcssSelector_01 {
    public static void main(String[] args) {
        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //2- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //3- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //4- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";
        if (actualTitle.contains(expectedTitle) ) {
            System.out.println("Title is " + actualTitle);
        }else System.out.println(actualTitle);
        //5- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
        //6- Birthday butonuna basin
       driver.findElement(By.xpath("//*[@alt='Birthday']")).click();
        //7- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@data-a-hires='https://images-na.ssl-images-amazon.com/images/I/51DnSfdl5mL._AC_SX368_.jpg']")).click();
        // 8- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();
        //9- Urun ucretinin 25$ oldugunu test edin
        WebElement text25$  =  driver.findElement(By.xpath("//*[text()='$25.00'][1]"));
        String str = text25$.getText();
        if (str.contains("$25.00")){
            System.out.println("Tested 25$ passed");
        }else System.out.println("Tested 25$ failed");
        // 10- Sayfayi kapatin
        driver.close();









    }
}
