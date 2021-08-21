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

public class ImdbModifyDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbModifyData(driver);
    }

    @Override
    public ImdbModifyData getPage(){

        //castolás
        return (ImdbModifyData) super.getPage();
    }

    @Test
    public void modifyDataTest(){
        String name = "My list";
        String description = "Monika's list";

        String expected_name = "M List";
        String expected_description = "Moncsi's list";

        getPage().signIn();
        getPage().modifyDataInit(name);
        getPage().modifyData(expected_name,expected_description);


        String actual_name = getPage().getModifyActualName();
        String actual_description = getPage().getModifyActualDescription();

        Assertions.assertEquals(expected_name,actual_name);
        Assertions.assertEquals(expected_description,actual_description);
    }
}
