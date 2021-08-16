import org.openqa.selenium.By;

public class ImdbList {
    //1 filmre való keresés/listázás és a találatok szűkítése után a konkrét film kiválasztása és adatainak megjelenítése
    public static final By SUGGESTION_SEARCH = By.id("suggestion-search");
    public static final By EXACT_TITLE_MATCHES = By.xpath("//*[@id=\"main\"]/div/div[2]/div/a[2]");
}
