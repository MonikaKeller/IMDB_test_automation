import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImdbRepeatedDataEntryTest extends ImdbTest{

    public static final String WATCHLIST_UPLOAD_FILE = "src/test/resources/teszt.txt";


    @Override
    public Imdb createPage(){
        return new ImdbRepeatedDataEntry(driver);
    }

    @Override
    public ImdbRepeatedDataEntry getPage(){

        //castolás
        return (ImdbRepeatedDataEntry) super.getPage();
    }

    @Test
    public void repeatedDataEntryTest(){
        getPage().signIn();
        List<String> titles = openFile();
        getPage().repeatedDataEntry(titles);

        //TODO: Assertions hiányzik
        //Assertions.assertEquals(expected,actual);
    }

    public List<String> openFile(){
        List<String> titles = new ArrayList<>();
        try {
            File file = new File(WATCHLIST_UPLOAD_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                 titles.add(line);
            }
            reader.close();


        } catch (IOException e) {
            Assertions.fail("The file not exist", e);
        }
        return titles;
    }
}
