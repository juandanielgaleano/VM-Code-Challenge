package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class BasePage {

    public  static WebDriver driver;
    public static WebDriverWait wait;

    static{
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\Resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);

    }
    public void navigateTo(String url){
        driver.get(url);
    }
    public WebElement FindByName(String locator){
        return wait.until(ExpectedConditions.elementToBeClickable(By.name(locator)));
    }
    public WebElement FindById(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

}




