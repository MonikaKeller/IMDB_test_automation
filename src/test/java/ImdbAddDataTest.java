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

public class ImdbAddDataTest extends ImdbTest{

    //abstract factory pattern
    @Override
    public Imdb createPage(){
        return new ImdbAddData(driver);
    }

    @Override
    public ImdbAddData getPage(){

        //castolás
        return (ImdbAddData)super.getPage();
    }

    @Test
    public void createNewListTest(){
        String name = "My list";
        String description = "Monika's list";
        String type = "Titles";
        Boolean publicList = true;

        getPage().signIn();
        getPage().createNewListInit();
        getPage().createNewListFillData(name,description,type,publicList);
        String actual = getPage().getActual();

        Assertions.assertEquals(name,actual);
    }
}
