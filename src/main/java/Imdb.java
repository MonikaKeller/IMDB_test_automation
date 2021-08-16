import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imdb {

    //https://www.imdb.com/
    public static final By SIGN_IN= By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div");
    public static final By PRIVACY_POLICY = By.xpath("//*[@id=\"__next\"]/footer/div[2]/div[1]/div[3]/ul/li[5]/a");

    private WebDriver driver;

    public Imdb(WebDriver driver) {
        this.driver = driver;
    }

    public void start() {
        driver.navigate().to("https://www.imdb.com/");
    }

}
