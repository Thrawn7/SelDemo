import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sel {
    private static WebDriver driver = new ChromeDriver();
    private static String xPath = "/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form[1]";
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        driver.get("https://projectstem.org/users/sign_in");

        /*       WebElement user_login = driver.findElement(By.id("user_login"));
        WebElement user_password = driver.findElement(By.id("user_password"));
        user_login.clear(); user_password.clear();
        user_login.sendKeys("user");
        user_password.sendKeys("passward"); */
        
        WebElement google = driver.findElement(By.xpath(xPath));
        System.out.println(google.getText());  
        
        System.out.println();

        google.click(); 
        //Thread.sleep(5000);
        
        //driver.get("https://courses.projectstem.org/courses/63543/grades");
        Thread.sleep(5000);
        driver.quit();
        
        //Assert.assertEquals(1, 1);
    }

}
