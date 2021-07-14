package addToCart;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.AddToCart;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class AddToCartTests extends BaseTests {
    @Test
    public void testClick() throws InterruptedException {
        AddToCart addToCart = homePage.clickCategoriaSummerDresses();
        addToCart.clickAddToCartButton();
        Thread.sleep(4000);
        assertEquals(addToCart.getSuccessfullMessage(),"Product successfully added to your shopping cart","it wasn't add to car");
    }


}
