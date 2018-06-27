import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo_QA {

    static protected WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe ");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("http://demoqa.com/registration/");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl() + "\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("name_3_firstname")).sendKeys("Raj");

        driver.findElement(By.id("name_3_lastname")).sendKeys("Patel");

        driver.findElement(By.name("radio_4[]")).click();

        driver.findElement(By.name("checkbox_5[]")).click();

        driver.findElement(By.id("dropdown_7")).isSelected();

        driver.findElement(By.id("mm_date_8")).isSelected();

        driver.findElement(By.id("dd_date_8")).isSelected();

        driver.findElement(By.id("yy_date_8")).isSelected();

        driver.findElement(By.id("phone_9")).sendKeys("09876543212");

        driver.findElement(By.id("username")).sendKeys("raaj");

        driver.findElement(By.id("email_1")).sendKeys("raj127@gmail.com");

        driver.findElement(By.id("description")).sendKeys("abcdefgh");

        driver.findElement(By.id("password_2")).sendKeys("12345678");

        driver.findElement(By.id("confirm_password_password_2")).sendKeys("12345678");

        driver.findElement(By.name("pie_submit")).click();
    }
}