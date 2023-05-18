package fn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fn.*;
import io.github.bonigarcia.wdm.WebDriverManager;


/* import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; */
//import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    private static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        driver.manage().window().maximize();
        ProjectSTEM pS = new ProjectSTEM(driver, "Rootsedw000@stillwaterschools.org", "pass");

        Thread.sleep(5000);
        //Assert.assertEquals(1, 1);
    }

}
