import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbList extends Imdb {

    public static final By EXACT_TITLE_MATCHES = By.xpath("//*[@id=\"main\"]/div/div[2]/div/a[2]");
    public static final By SEARCH_CATEGORY = By.id("findSubHeaderLabel");


    public ImdbList(WebDriver driver) {
        super(driver);
    }

    public String dataSearch(){
        driver.findElement(SUGGESTION_SEARCH).sendKeys("Star wars\n");
        return driver.findElement(TITLE_MATCHES).getText();

    }

    public String listSearch(){
        driver.findElement(EXACT_TITLE_MATCHES).click();
        return driver.findElement(SEARCH_CATEGORY).getText();
    }
}
