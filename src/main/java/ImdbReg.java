import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImdbReg extends Imdb {

    public static final By CREATE_A_NEW_ACCOUNT_BUTTON= By.xpath("//*[@id=\"signin-options\"]/div/div[2]/a");
    public static final By CUSTOMER_NAME= By.id("ap_customer_name");
    public static final By EMAIL= By.id("ap_email");
    public static final By PASSWORD= By.id("ap_password");
    public static final By PASSWORD_CHECK= By.id("ap_password_check");
    public static final By CREATE_YOUR_IMDB_ACCOUNT_BUTTON= By.id("continue");
    public static final By VERIFY_TEXT= By.xpath("//*[@id=\"verification-code-form\"]/div[4]/div[1]/h1");


    /*Teszt Elek2
    tesztelek4564567@gmail.com
    jelszó: Tesztelek34 */
    static final String REG_NAME = "Teszt Elek2";
    static final String REG_EMAIL = "tesztelek4564567@gmail.com";
    static final String REG_PASSWORD = "Tesztelek34";
    static final String REG_REPASSWORD = "Tesztelek34";

    public ImdbReg(WebDriver driver) {
        super(driver);
    }

    public void signInClick(){
        driver.findElement(SIGN_IN).click();
    }

    public void createNewAccountClick(){
        driver.findElement(CREATE_A_NEW_ACCOUNT_BUTTON).click();
    }

    public void Registration(){
        //Explicit wait legyen
        driver.findElement(CUSTOMER_NAME).sendKeys(REG_NAME);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(EMAIL).sendKeys(REG_EMAIL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(PASSWORD).sendKeys(REG_PASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(PASSWORD_CHECK).sendKeys(REG_REPASSWORD);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(CREATE_YOUR_IMDB_ACCOUNT_BUTTON).click();

    }

    public String registrationText(){
        return driver.findElement(VERIFY_TEXT).getText();
    }
}
