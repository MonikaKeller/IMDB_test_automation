import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbPaginationTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbPagination(driver);
    }

    @Override
    public ImdbPagination getPage(){

        //castolás
        return (ImdbPagination) super.getPage();
    }

    @Test
    public void dataSearchTest(){
        String expected_film = "\"Star wars\"";

        getPage().start();

        String actual_film = getPage().dataSearch();

        Assertions.assertEquals(expected_film,actual_film);


    }
    @Test
    public void filmSelectTitleTest(){
        String expected_film_title = "Original title: Star Wars";

        getPage().start();

        getPage().dataSearch();
        getPage().filmSelect();
        getPage().filmSelectTitle();

        String actual_film_title = getPage().filmSelectTitle();

        Assertions.assertEquals(expected_film_title,actual_film_title);

    }

    public void filmPaginationTest(){
        
    }
}
