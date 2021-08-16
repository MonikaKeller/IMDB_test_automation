public class ImdbRegTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbReg(driver);
    }

    @Override
    public ImdbReg getPage(){

        //castolás
        return (ImdbReg) super.getPage();
    }
}
