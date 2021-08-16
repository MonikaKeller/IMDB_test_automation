import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbExportData extends Imdb {
    //Lementem a Watchlist-em tartalmát fájlba

    public static final By FILM_TITLE1 = By.xpath("//*[@id=\"main\"]/div/div[4]/div[3]/div[1]/div[2]/h3/a");
    public static final By FILM_TITLE2 = By.xpath("//*[@id=\"main\"]/div/div[4]/div[3]/div[2]/div[2]/h3/a");

    public ImdbExportData(WebDriver driver) {
        super(driver);
    }
}
