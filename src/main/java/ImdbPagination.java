import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbPagination extends Imdb {

    //Film galériában tudunk többoldalas listában lapozni
    public static final By NEXT_BUTTON= By.xpath("//*[@id=\"right\"]/a");

    public ImdbPagination(WebDriver driver) {
        super(driver);
    }
}
