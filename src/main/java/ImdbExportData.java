import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbExportData extends Imdb {


    public static final By EXPORT_WATCHLIST = By.xpath("//*[@id=\"center-1-react\"]/div/div[4]/a");



    public ImdbExportData(WebDriver driver) {
        super(driver);
    }

    public void exportData(String filmTitle, String filmYear){

        driver.findElement(WATCHLIST).click();

        if(!isWatchListEmpty()) {
            driver.findElement(EXPORT_WATCHLIST).click();
            sleep(10000);
        }
        else {
            driver.findElement(EDIT_BUTTON).click();

            WebElement inputField = driver.findElement(ADD_TO_LIST_SEARCH);
            inputTextAsHuman(inputField, filmTitle + " (" + filmYear + ")");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_ITEM));
            sleep(1000);
            driver.findElement(SEARCH_ITEM).click();

            driver.findElement(DONE_BUTTON).click();

            driver.findElement(EXPORT_WATCHLIST).click();
            sleep(10000);
        }
    }

    public boolean isWatchListEmpty() {
        try {
            driver.findElement(WATCHLIST_EMPTY);
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

}
