import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelTest {
    private static WebDriver driver = new ChromeDriver();

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        driver.manage().window().maximize();
        driver.get("https://projectstem.org/users/sign_in");
        /*       WebElement user_login = driver.findElement(By.id("user_login"));
        WebElement user_password = driver.findElement(By.id("user_password"));
        user_login.clear(); user_password.clear();
        user_login.sendKeys("user");
        user_password.sendKeys("passward"); */
        
       //WebElement google = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form[1]/button"));
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form[1]/button")).submit();
        //google.click();
        System.out.println(driver.getCurrentUrl().substring(0,28).equalsIgnoreCase("https://accounts.google.com/"));
        Assert.assertEquals(driver.getCurrentUrl().substring(0,28), "https://accounts.google.com/");
        WebElement user = driver.findElement(By.id("identifierId"));
        user.sendKeys("rootsedw000@stillwaterschools.org");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
        
        //driver.get("https://courses.projectstem.org/courses/63543/grades");
        driver.quit();
        
        //Assert.assertEquals(1, 1);
    }

}
