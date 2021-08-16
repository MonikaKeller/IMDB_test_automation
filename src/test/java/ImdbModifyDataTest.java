public class ImdbModifyDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbModifyData(driver);
    }

    @Override
    public ImdbModifyData getPage(){

        //castolás
        return (ImdbModifyData) super.getPage();
    }
}
