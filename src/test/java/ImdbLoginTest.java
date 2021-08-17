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

public class ImdbLoginTest extends ImdbTest{


    @Override
    public Imdb createPage(){
        return new ImdbLogin(driver);
    }

    @Override
    public ImdbLogin getPage(){

        //castolás
        return (ImdbLogin)super.getPage();
    }

    @Test
    public void loginTextTest(){
        getPage().signIn();
        String actual = getPage().loginText();

        String expected = "Teszt";
        Assertions.assertEquals(expected,actual);
    }
}
