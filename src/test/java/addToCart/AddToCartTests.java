package addToCart;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.AddToCart;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTests {
    @Test
    public void testClick() throws InterruptedException {
        AddToCart addToCart = homePage.clickCategoriaSummerDresses();
        addToCart.clickAddToCartButton();
        Thread.sleep(5000);
        assertEquals(addToCart.getSuccessfullMessage(), "Product successfully added to your shopping cart","error");
    }


}
