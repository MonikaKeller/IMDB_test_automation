public class ImdbLoginTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbLogin(driver);
    }

    @Override
    public ImdbLogin getPage(){

        //castolás
        return (ImdbLogin)super.getPage();
    }
}
