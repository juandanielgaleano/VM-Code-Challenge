import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initWebDriver(WebDriver driver, WebDriverWait wait) {
        BasePage.driver = driver;
        BasePage.wait = wait;
    }

    public void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
}

