import org.junit.jupiter.api.Assertions;

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

    public void privacyPolicyTextTest(){
        getPage().signIn();
        getPage().privacyPolicyClick();

        String actual = getPage().privacyPolicyText();

        String expected = "IMDb Privacy Notice";
        Assertions.assertEquals(expected,actual);
    }
}
