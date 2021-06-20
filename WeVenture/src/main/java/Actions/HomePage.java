package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage
{
   private WebDriver driver;
   private By signIn =By.xpath("//span[.='Sign In']");
   private By login = By.linkText("login");

    public HomePage (WebDriver driver){
        this.driver=driver;
    }

   public void holdSignIn (){
        driver.findElement(signIn).click();
   }
   public LoginPage clickLogin (){
       driver.findElement(login).click();
       return new LoginPage (driver);
   }



}