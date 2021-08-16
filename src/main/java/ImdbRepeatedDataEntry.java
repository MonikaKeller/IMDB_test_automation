import org.openqa.selenium.By;

public class ImdbRepeatedDataEntry {

    //Adatok felvitele .csv fájlból: Watchlist

    public static final By WATCHLIST = By.xpath("///*[@id=\"imdbHeader\"]/div[2]/div[4]/a/div");

    public static final By SUGGESTION_SEARCH = By.id("suggestion-search");
    public static final By CLICK_TO_ADD_TO_WATCHLIST = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[2]/div/div/button[1]/div");


}
