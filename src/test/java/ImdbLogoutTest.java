import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbLogoutTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbLogout(driver);
    }

    @Override
    public ImdbLogout getPage(){


        return (ImdbLogout)super.getPage();
    }

    @Test
    @Description("IMDB_testing.xls: TC3")
    public void logoutAfterTest(){
        getPage().signIn();
        getPage().logoutClick();

        String actual = getPage().logoutAfter();

        String expected = "Sign In";
        Assertions.assertEquals(expected,actual);
    }
}
