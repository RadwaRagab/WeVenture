package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailfield = By.id("userName");
    private By continueButton = By.id("checkUser");


    public LoginPage (WebDriver driver){
        this.driver=driver;
    }

    public void setEmail (String email){
        driver.findElement(emailfield).sendKeys(email);
    }
    public void clickConitnueButton (){
        driver.findElement(continueButton).click();
    }




}
