public class ImdbPaginationTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbPagination(driver);
    };
}
