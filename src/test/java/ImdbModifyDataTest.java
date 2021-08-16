public class ImdbModifyDataTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbModifyData(driver);
    };
}
