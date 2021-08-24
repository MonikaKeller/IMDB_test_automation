
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbLoginTest extends ImdbTest{


    @Override
    public Imdb createPage(){
        return new ImdbLogin(driver);
    }

    @Override
    public ImdbLogin getPage(){


        return (ImdbLogin)super.getPage();
    }

    @Test
    @Description("IMDB_testing.xlsx: TC2")
    public void loginTextTest(){
        getPage().signIn();
        String actual = getPage().loginText();

        String expected = "Teszt";
        Assertions.assertEquals(expected,actual);
    }
}
