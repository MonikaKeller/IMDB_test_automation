
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ImdbPrivacyPolicy extends Imdb {
    public static final By PRIVACY_POLICY = By.xpath("//*[@id=\"__next\"]/footer/div[2]/div[1]/div[3]/ul/li[5]/a");
    public static final By PRIVACY_POLICY_TEXT = By.xpath("//*[@id=\"main\"]/h1/strong");

    public ImdbPrivacyPolicy(WebDriver driver) {
        super(driver);
    }

    public void privacyPolicyClick(){
       driver.findElement(PRIVACY_POLICY).click();
    }

    public String privacyPolicyText(){
        //TODO: implicitlyWait helyett kell egy másik Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(PRIVACY_POLICY_TEXT).getText();

    }

}
