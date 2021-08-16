public class ImdbListTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbList(driver);
    };
}
