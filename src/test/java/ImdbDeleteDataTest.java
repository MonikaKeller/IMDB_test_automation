import org.junit.jupiter.api.Assertions;
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

public class ImdbDeleteDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbDeleteData(driver);
    }

    @Override
    public ImdbDeleteData getPage(){

        //castolás
        return (ImdbDeleteData) super.getPage();
    }

    @Test
    public void deleteDataTest(){

        getPage().signIn();
        getPage().deleteDataInit();

    }
}
