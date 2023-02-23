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
        wd.navigate().to("https://telranedu.web.app/login");
//      wd.navigate().forward();
//      wd.navigate().back();
    }


    @Test
    public void FindElements() {
//      System.out.println("Test is over");
//      WebElement element = wd.findElement(By.tagName("a"));

        WebElement login = wd.findElement(By.linkText("LOGIN"));
        System.out.println(login.getAttribute("href"));
        WebElement home = wd.findElement(By.linkText("HOME"));
        System.out.println(home.getAttribute("href"));
        WebElement about = wd.findElement(By.linkText("ABOUT"));
        System.out.println(about.getAttribute("href"));

        WebElement log = wd.findElement(By.partialLinkText("LOG"));
        System.out.println(log.getAttribute("href"));
        WebElement out = wd.findElement(By.partialLinkText("OUT"));
        System.out.println(out.getAttribute("href"));
        WebElement om = wd.findElement(By.partialLinkText("OM"));
        System.out.println(om.getAttribute("href"));

        List<WebElement> container = wd.findElements(By.className("container"));
        System.out.println(container.size());
        List<WebElement> navbar = wd.findElements(By.className("navbar-component_nav__1X_4m"));
        System.out.println(navbar.size());
        List<WebElement> active = wd.findElements(By.className("active"));
        System.out.println(active.size());

        List<WebElement> div = wd.findElements(By.tagName("div"));
        System.out.println(div.size());
        List<WebElement> button = wd.findElements(By.tagName("button"));
        System.out.println(button.size());
        List<WebElement> input = wd.findElements(By.tagName("input"));
        System.out.println(input.size());

//       List<WebElement> elements = wd.findElements(By.tagName("a"));
//       System.out.println(elements.size());

    }


    @AfterMethod
    public void postCondition() {
//      wd.close();
        wd.quit();
    }


}
