import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ImdbRepeatedDataEntry extends Imdb {

    //Adatok felvitele .text fájlból: Watchlist

    public static final By TOTAL_CHECK = By.id("totalCheck");
    public static final By DELETE_ITEMS = By.id("delete_items");
    public static final By ALERT_DELETE = By.id("//input[@type=\"submit\" and @value=\"DELETE\"]");





    public ImdbRepeatedDataEntry(WebDriver driver) {
        super(driver);
    }

    public void repeatedDataEntry(List<String> titles){

        driver.findElement(WATCHLIST).click();

        if(!isWatchListEmpty()) {
            deleteWatchlist();
        }

        uploadWatchlist(titles);
        driver.findElement(DONE_BUTTON).click();

    }

    public void deleteWatchlist(){
        driver.findElement(EDIT_BUTTON).click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TOTAL_CHECK));
        sleep(1000);

        WebElement checkBoxTotal = driver.findElement(TOTAL_CHECK);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checkBoxTotal);
        driver.findElement(DELETE_ITEMS).click();
        //TODO: Ha lesz idő, kicserélni explicitWait-re
        sleep(1000);

        driver.findElement(ALERT_DELETE).click();
        sleep(5000);



    }


    public void uploadWatchlist(List<String> titles){

    }
}
