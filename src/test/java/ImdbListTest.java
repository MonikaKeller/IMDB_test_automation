import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbListTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbList(driver);
    }

    @Override
    public ImdbList getPage(){

        //castolás
        return (ImdbList) super.getPage();
    }

    @Test
    public void dataSearchTest(){
        String expected_film = "\"Star wars\"";

        getPage().start();

        String actual_film = getPage().dataSearch();

        Assertions.assertEquals(expected_film,actual_film);


    }

    @Test
    public void listSearchTest(){
        String expected_search = "Search category:";

        getPage().start();
        getPage().dataSearch();
        String actual_search = getPage().listSearch();
        Assertions.assertEquals(expected_search,actual_search);
    }
}
