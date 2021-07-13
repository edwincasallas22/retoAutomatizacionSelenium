package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By initialInfo = By.className("info-account");
    private By signOutButton = By.className("logout");
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getInitialInfo(){
        return driver.findElement(initialInfo).getText();
    }
    public void clickSignOutButton(){
        driver.findElement(signOutButton).click();
    }

}
