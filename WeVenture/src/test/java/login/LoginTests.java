package login;

import base.BaseTests;
import org.testng.annotations.Test;
import Actions.LoginPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
@Test
    public void testSuccessfullLogin(){
        homePage.holdSignIn();
       LoginPage loginPage=homePage.clickLogin();
        loginPage.setEmail("hippen@gmailni.com");
        loginPage.clickConitnueButton();

    }
}
