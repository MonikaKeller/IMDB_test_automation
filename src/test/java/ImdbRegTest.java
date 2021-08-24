import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

public class ImdbRegTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbReg(driver);
    }

    @Override
    public ImdbReg getPage(){


        return (ImdbReg) super.getPage();
    }
    @Disabled
    @Test
    @Description("IMDB_testing.xlsx: TC1, A teszteset csak részben automatizálható," +
            "mert email megerősítés szükséges a befejezéshez.")
    public void RegistrationTest(){
        getPage().signInClick();
        getPage().createNewAccountClick();
        getPage().Registration();

        String actual = getPage().registrationText();

        String expected = "Verify email address";
        Assertions.assertEquals(expected,actual);
    }
}
