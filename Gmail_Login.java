import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Gmail_Login {

    static protected WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe ");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");

        driver.manage().deleteAllCookies();

        System.out.println(driver.getCurrentUrl() + "\n");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("firstName")).sendKeys("Raj");

        driver.findElement(By.id("lastName")).sendKeys("Patel");

        driver.findElement(By.id("username")).sendKeys("rajamarnathm1233");

        driver.findElement(By.name("Passwd")).sendKeys("123456r@");

        driver.findElement(By.name("ConfirmPasswd")).sendKeys("123456r@");

        driver.findElement(By.xpath("//div[@id=\"accountDetailsNext\"]/content/span")).click();
        
        driver.quit();
    }


}