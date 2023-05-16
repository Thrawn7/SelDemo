import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://saucelabs.com/test/guinea-pig");
        
        Thread.sleep(5000);

        driver.quit();
    }

}
