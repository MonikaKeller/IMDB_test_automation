public class ImdbListTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbList(driver);
    }

    @Override
    public ImdbList getPage(){

        //castolás
        return (ImdbList) super.getPage();
    }
}
