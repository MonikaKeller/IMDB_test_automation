import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbPrivacyPolicy extends Imdb {
    public ImdbPrivacyPolicy(WebDriver driver) {
        super(driver);
    }

    //https://www.imdb.com/privacy

}
