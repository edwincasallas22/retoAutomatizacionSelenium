package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public AddToCart clickCategoriaSummerDresses(){
        clickXpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
        clickXpath("//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a");
        return new AddToCart(driver);


    }

    public Login clickLoginButton(){
        clickLinkText("Sign in");
        return new Login(driver);
    }

    public void clickXpath(String xPath){
        driver.findElement(By.xpath(xPath)).click();

    }
    public void clickLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
