public class ImdbPrivacyPolicyTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbPrivacyPolicy(driver);
    }

    @Override
    public ImdbPrivacyPolicy getPage(){

        //castolás
        return (ImdbPrivacyPolicy) super.getPage();
    }
}
