import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PHP_Travels {

         static protected WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe ");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net/register");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl() + "\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.name("firstname")).sendKeys("siddharth");

        driver.findElement(By.name("lastname")).sendKeys("Malhodra");

        driver.findElement(By.name("phone")).sendKeys("09876543212");

        driver.findElement(By.name("email")).sendKeys("raj1@gmail.com");

        driver.findElement(By.name("password")).sendKeys("raj1234");

        driver.findElement(By.name("confirmpassword")).sendKeys("raj1234");

        driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();

        driver.quit();
    }
}