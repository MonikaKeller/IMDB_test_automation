public class ImdbAddDataTest extends ImdbTest{

    //abstract factory pattern
    @Override
    public Imdb createPage(){
        return new ImdbAddData(driver);
    }

    @Override
    public ImdbAddData getPage(){

        //castolás
        return (ImdbAddData)super.getPage();
    }
}
