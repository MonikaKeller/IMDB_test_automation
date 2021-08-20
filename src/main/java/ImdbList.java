import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbList extends Imdb {
    //1 filmre való keresés/listázás és a találatok szűkítése után a konkrét film kiválasztása és adatainak megjelenítése
    public static final By SUGGESTION_SEARCH = By.id("suggestion-search");
    public static final By EXACT_TITLE_MATCHES = By.xpath("//*[@id=\"main\"]/div/h1/span");


    public ImdbList(WebDriver driver) {
        super(driver);
    }

    public String dataSearch(){
        driver.findElement(SUGGESTION_SEARCH).sendKeys("Star wars\n");
        return driver.findElement(EXACT_TITLE_MATCHES).getText();

    }

    public void listSearch(){

    }
}
