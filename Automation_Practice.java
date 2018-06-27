import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Automation_Practice{
    static protected WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe ");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl() + "\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("email_create")).sendKeys("rahul1@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Rahul");

        driver.findElement(By.id("customer_lastname")).sendKeys("Makwana");

        driver.findElement(By.id("email")).click();

        driver.findElement(By.id("passwd")).sendKeys("rahul1");

        driver.findElement(By.id("days")).isSelected();

        driver.findElement(By.id("months")).isSelected();

        driver.findElement(By.id("years")).isSelected();

        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.id("optin")).click();

        driver.findElement(By.id("firstname")).click();

        driver.findElement(By.id("lastname")).click();

        driver.findElement(By.id("company")).sendKeys("ABC Ltd");

        driver.findElement(By.id("address1")).sendKeys("Adgware,ha9 6as");

        driver.findElement(By.id("address2")).sendKeys("108 a unit");

        driver.findElement(By.id("city")).sendKeys("london");

        driver.findElement(By.id("id_state")).isSelected();

        driver.findElement(By.id("postcode")).sendKeys("10900");

        driver.findElement(By.id("uniform-id_country")).isSelected();

        driver.findElement(By.id("other")).sendKeys("09876654321");

        driver.findElement(By.id("phone")).sendKeys("06789123456");

        driver.findElement(By.id("phone_mobile")).sendKeys("08976543212");

        driver.findElement(By.id("alias")).sendKeys("adgware,london");

        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();

        driver.quit();
    }
}
