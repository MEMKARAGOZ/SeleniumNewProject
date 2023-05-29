package selenium_odevler.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practise_04 {
    public static void main(String[] args) {
        System.setProperty("chromedriver", "src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.com/ ");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50, 50));
        driver.manage().window().setSize(new Dimension(1000, 1000));

        if (driver.manage().window().getPosition().equals(new Point(50, 50))) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        if (driver.manage().window().getSize().equals(new Dimension(1000, 1000))) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        driver.close();

    }
}
