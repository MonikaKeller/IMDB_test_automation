public class ImdbRepeatedDataEntryTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbRepeatedDataEntry(driver);
    };
}
