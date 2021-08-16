public class ImdbAddDataTest extends ImdbTest{

    //abstract factory pattern
    @Override
    public Imdb getPage(){
        return new ImdbAddData(driver);
    };
}
