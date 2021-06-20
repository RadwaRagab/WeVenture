package withoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Logiin {
    private WebDriver driver;

   // @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
    }
  //  @Test
    public void logIn (){
        WebElement signIn = driver.findElement(By.xpath("//span[.='Sign In']"));
        Actions actionProvider = new Actions(driver);
        actionProvider.clickAndHold(signIn).build().perform();
        signIn.click();
        driver.findElement(By.linkText("login")).click();
        driver.get("https://www.snapdeal.com/login");
        driver.findElement(By.id("checkUser")).click();
        //check error message if the user press continue without valid email
        String email = driver.findElement(By.id("userName-error")).getText();
        assertEquals(email, "Please enter your mobile number or email");
    }
   //@AfterClass
    public void tearDown(){
        driver.quit();
    }

}

