import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ImdbExportDataTest extends ImdbTest{

    public static final String WATCHLIST_CSV_FILE = "src/test/resources/WATCHLIST.csv";

    @Override
    public Imdb createPage(){
        return new ImdbExportData(driver);
    }

    @Override
    public ImdbExportData getPage(){


        return (ImdbExportData) super.getPage();
    }

    @Test
    public void exportDataTest(){
        getPage().signIn();
        deleteWatchListCsvFile();
        getPage().exportData("Spun", "2002");

        verifyCsvFile();

    }

    public void deleteWatchListCsvFile(){
        File file = new File(WATCHLIST_CSV_FILE);

        if (file.exists()) {
            file.delete();
        }
    }

    public void verifyCsvFile() {
        try {
            File file = new File(WATCHLIST_CSV_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            reader.close();

            Assertions.assertTrue(lines > 0);
        } catch (IOException e) {
            Assertions.fail("Exception when reading watchlist CSV file", e);
        }
    }
}
