public class ImdbRepeatedDataEntryTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbRepeatedDataEntry(driver);
    }

    @Override
    public ImdbRepeatedDataEntry getPage(){

        //castolás
        return (ImdbRepeatedDataEntry) super.getPage();
    }
}
