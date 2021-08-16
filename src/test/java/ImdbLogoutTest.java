public class ImdbLogoutTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbLogout(driver);
    }

    @Override
    public ImdbLogout getPage(){

        //castolás
        return (ImdbLogout)super.getPage();
    }
}
