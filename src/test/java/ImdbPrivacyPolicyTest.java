public class ImdbPrivacyPolicyTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbPrivacyPolicy(driver);
    };
}
