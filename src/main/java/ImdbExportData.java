import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImdbExportData extends Imdb {
    //Lementem a Watchlist-em tartalmát fájlba

    public static final By WATCHLIST = By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[4]/a/div");
    public static final By EXPORT_WATCHLIST = By.xpath("//*[@id=\"center-1-react\"]/div/div[4]/a");
    public static final By ADD_TO_WATCHLIST = By.id("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div");
    public static final By OPEN_LIST_ITEM = By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr/td[2]/a");

    public ImdbExportData(WebDriver driver) {
        super(driver);
    }

    public void exportDataInit(){
        //Ezt még formáljuk
        boolean empty_watchlist = true;
        //wait problem néha
        driver.findElement(WATCHLIST).click();
        driver.findElement(EXPORT_WATCHLIST).click();

        /*if(!empty_watchlist) {
            driver.findElement(EXPORT_WATCHLIST).click();
        }
        else {

            driver.findElement(SUGGESTION_SEARCH).sendKeys("Spun (2002)\n");
            driver.findElement(OPEN_LIST_ITEM).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(ADD_TO_WATCHLIST).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_SEARCH_ITEM));

            driver.findElement(WATCHLIST).click();
            driver.findElement(EXPORT_WATCHLIST).click();
        }*/
    }
}
