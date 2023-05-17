import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelTest {
    @Test
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucelabs.com/test/guinea-pig");
        WebElement forms = driver.findElement(By.id("the_forms_id"));
        forms.click();
        driver.quit(); 
        //Assert.assertEquals(1,1);
    }

}
