import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbPrivacyPolicyTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbPrivacyPolicy(driver);
    }

    @Override
    public ImdbPrivacyPolicy getPage(){


        return (ImdbPrivacyPolicy) super.getPage();
    }
    @Test
    @Description("IMDB_testing.xlsx: TC4")
    public void privacyPolicyTextTest(){

        getPage().privacyPolicyClick();

        String actual = getPage().privacyPolicyText();

        String expected = "IMDb Privacy Notice";
        Assertions.assertEquals(expected,actual);
    }
}
