public class ImdbLoginTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbLogin(driver);
    };
}
