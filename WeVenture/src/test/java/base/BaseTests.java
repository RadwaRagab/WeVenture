package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Actions.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
    }

  @BeforeMethod
    public void goHome(){
        driver.get("https://www.snapdeal.com/login");
        homePage = new HomePage(driver);
    }
  @AfterClass
    public void tearDown(){
        driver.quit();
    }



}

