
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Guru_99_Register {


    //calling driver
   static protected WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/v4/");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl()+"\n");

        System.out.println(driver.getTitle()+"\n");

        driver.findElement(By.name("uid")).sendKeys("mngr139452");

        driver.findElement(By.name("password")).sendKeys("udUgumA");

        driver.findElement(By.name("btnLogin")).click();

        //adding new customer.
        driver.findElement(By.linkText("New Customer")).click();

        // add details of customer.
        driver.findElement(By.name("name")).sendKeys("Jagg");

        driver.findElement(By.name("rad1")).click();

        driver.findElement(By.id("dob")).sendKeys("12/06/1978");

        driver.findElement(By.name("addr")).sendKeys("12 Manorfield");

        driver.findElement(By.name("city")).sendKeys("Londres");

        driver.findElement(By.name("state")).sendKeys("England");

        driver.findElement(By.name("pinno")).sendKeys("364290");

        driver.findElement(By.name("telephoneno")).sendKeys("987654321");

        driver.findElement(By.name("emailid")).sendKeys("any_any2@any.com");

        driver.findElement(By.name("password")).sendKeys("any_any");

        driver.findElement(By.name("sub")).click();

        System.out.println("Customer Registered Successfully!!!");

        driver.quit();
    }
}
