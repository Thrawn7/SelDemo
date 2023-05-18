package fn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Sel {
    private WebDriver driver;

    public Sel(WebDriver d){
        this.driver = d;
    }
    
    public WebElement find( String str){
        if (str.substring(0,1).equals("/")){return driver.findElement(By.xpath(str));
        } else {return driver.findElement(By.id(str));}
    }

    public boolean checkWebPage(String str){
        String url = driver.getCurrentUrl();
        return url.equalsIgnoreCase(str);
    }
    public boolean checkWebPage(String str, int len){
        String url = driver.getCurrentUrl().substring(0, len);
        return url.equalsIgnoreCase(str);
    }
    
}
