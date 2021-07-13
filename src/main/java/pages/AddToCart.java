package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");
    private By successfullMessage = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    public AddToCart(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }

    public String getSuccessfullMessage(){
        return driver.findElement(successfullMessage).getText();
    }

}
