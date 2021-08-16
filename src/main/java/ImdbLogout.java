import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbLogout extends Imdb {
    public static final By LOGOUT = By.xpath("//*[@id=\"navUserMenu-contents\"]/ul/a[7]");

    public ImdbLogout(WebDriver driver) {
        super(driver);
    }
}
