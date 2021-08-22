import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbPagination extends Imdb {


    public static final By NEXT_BUTTON= By.xpath("//a[contains(text(),'Next')]");
    public static final By FILMSELECT= By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a");
    public static final By FILMTITLE= By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/h1");
    public static final By SEARCH_ORIGINAL_TITLE = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div[1]/div[2]/div");
    public static final By PHOTO_LINK= By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[1]/div/div[3]/a[2]");
    public static final By ADD_IMAGE_PHOTO= By.xpath("//*[@id=\"media_index_thumbnail_grid\"]/a[5]/span/span");

    public ImdbPagination(WebDriver driver) {
        super(driver);
    }


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

    public String filmPagination(){
        boolean nextButtonVisible = true;

            driver.findElement(PHOTO_LINK).click();
       do {

            try{

                    driver.findElement(NEXT_BUTTON).click();
                    WebDriverWait wait = new WebDriverWait(driver, 3);



            } catch (NoSuchElementException e){
                nextButtonVisible = false;
            }
       } while (nextButtonVisible);

       return  driver.findElement(ADD_IMAGE_PHOTO).getText();
    }


}
