public class ImdbDeleteDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbDeleteData(driver);
    }

    @Override
    public ImdbDeleteData getPage(){

        //castolás
        return (ImdbDeleteData) super.getPage();
    }
}
