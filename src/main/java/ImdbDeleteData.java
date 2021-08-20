import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbDeleteData extends Imdb {

    //xpath problems
    public static final By WATCHLIST = By.xpath("///*[@id=\"imdbHeader\"]/div[2]/div[4]/a/div");
    public static final By EDIT_WATCHLIST = By.xpath("//*[@id=\"center-1-react\"]/div/div[1]/div/div[1]/a");
    public static final By EDIT_WATCHLIST_CHECKBOX = By.xpath("//*[@id=\"2071030859\"]");
    public static final By DELETE_ITEMS = By.id("delete_items");
    public static final By DELETE_ITEMS_FORM = By.xpath("//*[@id=\"delete_items_form\"]/div/input");
    public static final By DELETE_THIS_LIST = By.xpath("//*[@id=\"ls507902895\"]");
    public static final By DELETE_ALERT = By.xpath("//*[@id=\"ls507902895\"]");

    public ImdbDeleteData(WebDriver driver) {
        super(driver);
    }

    public void deleteDataInit(){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(YOUR_LISTS).click();
        driver.findElement(THREE_POINTS).click();
        driver.findElement(DELETE_THIS_LIST).click();
        driver.findElement(DELETE_ALERT).click();
    }
}
