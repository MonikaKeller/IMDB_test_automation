import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbModifyData extends Imdb {

    //módosítsuk a felhasználó profil adatait Edit profile

    public static final By EDIT_PROFILE = By.xpath("//*[@id=\"main\"]/div/div[1]/ul/li[1]/a");
    public static final By SAVE_DESCRIPTION_BUTTON = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[1]");

    public ImdbModifyData(WebDriver driver) {
        super(driver);
    }
}
