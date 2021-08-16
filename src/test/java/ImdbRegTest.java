public class ImdbRegTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbReg(driver);
    };
}
