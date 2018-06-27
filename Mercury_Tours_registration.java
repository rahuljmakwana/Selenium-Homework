import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mercury_Tours_registration {

    static protected WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe ");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

        driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=649bc8cf2ce17ae2d091bce2b50775af");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl()+"\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.name("firstName")).sendKeys("Vips");

        driver.findElement(By.name("lastName")).sendKeys("Vast");

        driver.findElement(By.name("phone")).sendKeys("987654321");

        driver.findElement(By.id("userName")).sendKeys("any_any@any.com");

        driver.findElement(By.name("address1")).sendKeys("Abc street");

        driver.findElement(By.name("address2")).sendKeys("Harrow");

        driver.findElement(By.name("city")).sendKeys("London");

        driver.findElement(By.name("state")).sendKeys("England");

        driver.findElement(By.name("postalCode")).sendKeys("HA0 0OL");

        driver.findElement(By.name("country")).click();

        driver.findElement(By.id("email")).sendKeys("any.any");

        driver.findElement(By.name("password")).sendKeys("any.any");

        driver.findElement(By.name("confirmPassword")).sendKeys("any.any");

        driver.findElement(By.name("register")).click();

        driver.quit();
    }
}
