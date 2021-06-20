package withoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Password {
    private WebDriver driver;

  //  @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/login");
        driver.manage().window().maximize();
    }
   // @Test
    public void logIn (){
        driver.findElement(By.id("userName")).sendKeys("hippen@gmailni.com");
        driver.findElement(By.id("checkUser")).click();
        driver.findElement(By.id("j_number")).sendKeys("01789542148");
        driver.findElement(By.id("j_password")).sendKeys("123456789");
        driver.findElement(By.id("userSignup")).click();
        //check error message if the user press continue without valid passowrd
        String mobile = driver.findElement(By.id("j_number-error")).getText();
        assertEquals(mobile, "Please enter a valid mobile number");
    }
    // @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

