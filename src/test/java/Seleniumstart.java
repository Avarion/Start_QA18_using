import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Seleniumstart {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
//      wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/home");
//      wd.navigate().forward();
//      wd.navigate().back();
    }


    @Test
    public void testLogin() {
//        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }


    @AfterMethod
    public void postCondition() {
//      wd.close();
        wd.quit();
    }


}
