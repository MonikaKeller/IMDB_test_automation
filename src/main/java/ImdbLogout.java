import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbLogout extends Imdb {
    public static final By LOGOUT = By.xpath("//*[@id=\"navUserMenu-contents\"]/ul/a[7]");
    public static final By SIGN_IN= By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div");

    public ImdbLogout(WebDriver driver) {
        super(driver);
    }

    public void logoutClick(){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(LOGOUT).click();
    }

    public String logoutAfter(){
        return driver.findElement(SIGN_IN).getText();
    }
}
