package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver ;

    private By namefield = By.id("j_name");
    private By passwordfield = By.id("j_password");
    private By mobileField = By.id("j_number");
    private By signUpcontinueButton = By.id("userSignup");

    public void setName (String name)
    {
        driver.findElement(namefield).sendKeys(name);
    }

    public void setMobile (String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }
    public void setPassword (String password)
        {
            driver.findElement(passwordfield).sendKeys(password);
        }
    public void clickContinueButton (){
        driver.findElement(signUpcontinueButton).click();
    }
    }

