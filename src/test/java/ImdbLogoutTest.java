public class ImdbLogoutTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbLogout(driver);
    };
}
