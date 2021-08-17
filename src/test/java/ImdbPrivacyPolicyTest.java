import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImdbPrivacyPolicyTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbPrivacyPolicy(driver);
    }

    @Override
    public ImdbPrivacyPolicy getPage(){

        //castolás
        return (ImdbPrivacyPolicy) super.getPage();
    }

    public void privacyPolicyTextTest(){

        getPage().privacyPolicyClick();

        String actual = getPage().privacyPolicyText();

        String expected = "IMDb Privacy Notice";
        Assertions.assertEquals(expected,actual);
    }
}
