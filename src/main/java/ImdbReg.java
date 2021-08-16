import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbReg {

    //https://www.imdb.com/registration/signin?ref=nv_generic_lgin&u=%2F
    public static final By CUSTOMER_NAME= By.id("ap_customer_name");
    public static final By EMAIL= By.id("ap_email");
    public static final By PASSWORD= By.id("ap_password");
    public static final By PASSWORD_CHECK= By.id("ap_password_check");
    public static final By CREATE_ACCOUNT_BUTTON= By.id("continue");


}
