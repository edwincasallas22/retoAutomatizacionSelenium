package login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.AccountPage;
import pages.Login;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testLogin(){
        Login login = homePage.clickLoginButton();
        login.setEmailField("casallas22@hotmail.com");
        login.setPasswordField("12345");
        AccountPage accountPage = login.clickSignInButton();
        assertTrue(accountPage.getInitialInfo().contains("Welcome to your account. Here you can manage all of your personal information and orders."),"Welcome message is incorrect");
        accountPage.clickSignOutButton();
    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/login.csv"},numLinesToSkip = 1)
    public void testLoginAlerts(String emailList, String passList, String error1, String error2){

        Login login = homePage.clickLoginButton();
        login.setEmailField(emailList);
        login.setPasswordField(passList);
        login.clickSignInButton();
        assertTrue(login.getErrorText().contains(error1)&&login.getErrorText().contains(error2),"Error message");
    }
}
