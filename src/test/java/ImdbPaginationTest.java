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
}
