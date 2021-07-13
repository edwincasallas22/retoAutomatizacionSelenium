package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public AccountPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new AccountPage(driver);
    }
    public String getErrorText(){
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();

    }
}
