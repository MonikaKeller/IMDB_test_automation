
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbDeleteDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbDeleteData(driver);
    }

    @Override
    public ImdbDeleteData getPage(){


        return (ImdbDeleteData) super.getPage();
    }

    @Test
    @Description("IMDB_testing.xlsx: TC7")
    public void deleteDataTest(){
        String name = "My list";


        getPage().signIn();
        String listId = getPage().deleteDataInit(name);
        boolean actual = getPage().isListExists(listId);


        Assertions.assertEquals(false,actual);
    }
}
