import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbModifyData extends Imdb {

    //módosítsuk a felhasználó profil adatait Edit profile

    public static final By THREE_POINTS = By.id("ls507902895");
    public static final By EDIT_LIST = By.xpath("//*[@id=\"ls507902895\"]/ul/li[1]/a");
    public static final By TITLE = By.xpath("//textarea[@name='listTitle' and text()='My list']");
    public static final By DESCRIPTION = By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div[2]/div[1]");
    public static final By MODIFY_ACTUAL_NAME = By.xpath("//*[@id=\"main\"]/div/h1");
    public static final By MODIFY_ACTUAL_DESCRIPTION = By.xpath("//*[@id=\"main\"]/div/div[2]/p");

    public ImdbModifyData(WebDriver driver) {
        super(driver);
    }

    public void modifyDataInit(){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(YOUR_LISTS).click();
        driver.findElement(THREE_POINTS).click();
        driver.findElement(EDIT_LIST).click();


    }

    public void modifyData(String name, String description){
        driver.findElement(TITLE).sendKeys(name);
        driver.findElement(DESCRIPTION).sendKeys(description);
        driver.findElement(DONE_BUTTON).click();
    }
    public String getModifyActualName(){
        return driver.findElement(MODIFY_ACTUAL_NAME).getText();

    }

    public String getModifyActualDescription(){
        return driver.findElement(MODIFY_ACTUAL_DESCRIPTION).getText();
    }
}
