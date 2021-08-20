import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Imdb {


    public static final By SIGN_IN= By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div");
    public static final By EMAIL = By.id("ap_email");
    public static final By PASSWORD = By.id("ap_password");
    public static final By SIGN_IN_SUBMIT = By.id("signInSubmit");
    public static final By SIGN_IN_WITH_IMDB = By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]/span[2]");
    public static final By ACTUAL_LOGIN = By.xpath("//span[contains(@class, 'user-name')]");
    public static final By PROFILE_BUTTON = By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span");
    public static final By YOUR_LISTS = By.xpath("//*[@id=\"navUserMenu-contents\"]/ul/a[5]");
    public static final By DONE_BUTTON = By.xpath("//*[@id=\"main\"]/div[1]/button");
    //Ezzel a Three points xpath-tal vmi nem oké
    public static final By THREE_POINTS = By.id("ls507902895");
    public static final By SUGGESTION_SEARCH = By.id("suggestion-search");
    public static final By TITLE_MATCHES = By.xpath("//*[@id=\"main\"]/div/h1/span");

    //Teszt Elek
    //tesztelek1231234@gmail.com
    //jelszó: Tesztelek12
    static final String MY_EMAIL = "tesztelek1231234@gmail.com";
    static final String MY_PASSWORD = "Tesztelek12";

    public WebDriver driver;

    public Imdb(WebDriver driver) {
        this.driver = driver;
    }

    public void start() {
        driver.navigate().to("https://www.imdb.com/");
    }

    public void signIn() {

        driver.findElement(SIGN_IN).click();
        driver.findElement(SIGN_IN_WITH_IMDB).click();
        driver.findElement(EMAIL).sendKeys(MY_EMAIL);
        driver.findElement(PASSWORD).sendKeys(MY_PASSWORD);
        driver.findElement(SIGN_IN_SUBMIT).click();
    }

    public String loginText(){
        return driver.findElement(Imdb.ACTUAL_LOGIN).getText();

    }







}
