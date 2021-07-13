package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public  void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driver);

    }


    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
