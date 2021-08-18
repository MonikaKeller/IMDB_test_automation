import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

public class ImdbRegTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbReg(driver);
    }

    @Override
    public ImdbReg getPage(){

        //castolás
        return (ImdbReg) super.getPage();
    }
    @Test
    public void RegistrationTest(){
        getPage().Registration();

        String actual = getPage().registrationText();

        String expected = "Verify email address";
        Assertions.assertEquals(expected,actual);
    }
}
