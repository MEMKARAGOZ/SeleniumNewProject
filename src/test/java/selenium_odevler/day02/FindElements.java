package selenium_odevler.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
// Navigate to Amazon.com and search for "iphone"
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit();
        // Get the text of the search results and print it to console
        WebElement resultText = driver.findElement(By.cssSelector(".s-result-count"));
        System.out.println(resultText.getText());
        // Click on first five products and get their titles.
        for (int i=1; i<=5; i++) {
            String productTitleLocatorString = String.format("#search .s-result-list > div:nth-child(%d) h2 a", i);
            WebElement productTitleLink = driver.findElement(By.cssSelector(productTitleLocatorString));
            String titleText = productTitleLink.getText();
            System.out.println(titleText);
            productTitleLink.click();
            Thread.sleep(2000); // Wait for page to load before getting title.
            System.out.println(driver.getTitle());
            if (i < 5) {
                // Go back to previous page except after last iteration.
                driver.navigate().back();
            }
        }
        // Close the browser
        driver.quit();
    }
}
