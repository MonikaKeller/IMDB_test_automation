import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbPagination extends Imdb {

    //Film galériában tudunk többoldalas listában lapozni
    public static final By NEXT_BUTTON= By.xpath("//*[@id=\"right\"]/a");
    public static final By FILMSELECT= By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a");
    public static final By FILMTITLE= By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/h1");
    public static final By SEARCH_ORIGINAL_TITLE = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/div[2]/div");

    public ImdbPagination(WebDriver driver) {
        super(driver);
    }

    //Ezt kiszervezni
    public String dataSearch(){
        driver.findElement(SUGGESTION_SEARCH).sendKeys("Star wars\n");
        return driver.findElement(TITLE_MATCHES).getText();

    }

    public String filmSelect(){
        driver.findElement(FILMSELECT).click();
        return driver.findElement(FILMTITLE).getText();

    }

    public String filmSelectTitle(){

        return driver.findElement(SEARCH_ORIGINAL_TITLE).getText();

    }

    public void filmPagination(){

    }


}
