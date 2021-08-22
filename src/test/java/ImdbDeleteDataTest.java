
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
    public void deleteDataTest(){
        String name = "My list";

        getPage().signIn();
        getPage().deleteDataInit(name);

        //TODO: Assertions hiányzik még
        //Assertions.assertEquals(expected,actual);
    }
}
