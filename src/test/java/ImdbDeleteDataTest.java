public class ImdbDeleteDataTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbDeleteData(driver);
    };
}
