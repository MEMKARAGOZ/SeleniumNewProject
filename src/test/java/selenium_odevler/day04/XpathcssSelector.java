package selenium_odevler.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathcssSelector {
    public static void main(String[] args) {
        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




        // Sayfayı kapatınız
        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        // Add Element butonuna 100 defa basınız
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        // 100 defa basıldığını test ediniz
        for (int i = 0; i < 100; i++) {
            addButton.click();
        }

        int delete = driver.findElements(By.xpath("//*[text()='Delete']")).size();
        if (delete==100){
            System.out.println("Add Element button pressed 100 times");
        }else System.out.println("Add Element Button Test Fail");

        // 90 defa delete butonuna basınız
        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        }
        // 90 defa basıldığını doğrulayınız
        int deleteSize = driver.findElements(By.xpath("//button[@onclick='deleteElement()']")).size();
     if (deleteSize==10){
         System.out.println("Delete button pressed 90 times");
     }else System.out.println("Delete Button Test Fail");

    }
}
