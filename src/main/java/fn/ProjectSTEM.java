package fn;

import org.openqa.selenium.WebDriver;

/* import org.openqa.selenium.chrome.ChromeDriver;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager; */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSTEM {
    private WebDriver driver;
    private Sel sel;

    public ProjectSTEM(WebDriver webDriver, String user, String passward) {
        this.driver = webDriver;
        this.sel = new Sel(driver);

        login(user, passward);

    }

    private boolean login(String user, String passward) {
        driver.get("https://projectstem.org/users/sign_in");
        WebElement userLogin = sel.find("user_login");
        WebElement userPassword = sel.find("user_password");
        userLogin.clear();
        userPassword.clear();
        userLogin.sendKeys((CharSequence) (user));
        userPassword.sendKeys((CharSequence) (passward));
        sel.find("/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button").click();
        return true;
    }
    /*
     * private boolean loginGoogle(String user, String passward){
     * 
     * }
     */
    /*
     * public static void main(String[] args) throws InterruptedException {
     * WebDriverManager.chromiumdriver().setup();
     * driver.manage().window().maximize();
     * driver.get("https://projectstem.org/users/sign_in");
     * 
     * //WebElement google = driver.findElement(By.xpath(
     * "/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form[1]/button")
     * );
     * driver.findElement(By.xpath(
     * "/html/body/main/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form[1]/button")
     * ).submit();
     * //google.click();
     * WebElement user = driver.findElement(By.id("identifierId"));
     * user.sendKeys("rootsedw000@stillwaterschools.org");
     * driver.findElement(By.xpath(
     * "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button"
     * )).click();
     * 
     * //driver.get("https://courses.projectstem.org/courses/63543/grades");
     * Thread.sleep(5000);
     * 
     * //Assert.assertEquals(1, 1);
     * }
     */

}
