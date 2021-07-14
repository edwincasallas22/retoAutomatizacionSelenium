package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.HomePage;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTests {

    private WebDriver driverChrome;
    private WebDriver driverEdge;
    protected HomePage homePage;

    @BeforeAll
    public  void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driverChrome = new ChromeDriver();
        driverChrome.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driverChrome);

        // Codigo para hacer las pruebas con el driver de Microsoft Edge
       /* System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        driverEdge = new EdgeDriver();
        driverEdge.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driverEdge);*/

    }
    @AfterAll
    public void tearDown(){
       // driverEdge.quit();
        driverChrome.quit();
    }

}
