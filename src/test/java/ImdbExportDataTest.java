import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbExportDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbExportData(driver);
    }

    @Override
    public ImdbExportData getPage(){

        //castolás
        return (ImdbExportData) super.getPage();
    }

    @Test
    public void exportDataTest(){
        getPage().signIn();
        getPage().exportDataInit();

        //Assertions.assertEquals(expected,actual);
    }
}
