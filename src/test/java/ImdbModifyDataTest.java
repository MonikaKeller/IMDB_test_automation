import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbModifyDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbModifyData(driver);
    }

    @Override
    public ImdbModifyData getPage(){


        return (ImdbModifyData) super.getPage();
    }

    @Test
    @Description("IMDB_testing.xls: TC6")
    public void modifyDataTest(){
        String name = "My list";


        String expected_name = "M List";
        String expected_description = "Moncsi's list";

        getPage().signIn();
        getPage().modifyDataInit(name);
        getPage().modifyData(expected_name,expected_description);


        String actual_name = getPage().getModifyActualName();
        String actual_description = getPage().getModifyActualDescription();

        Assertions.assertEquals(expected_name,actual_name);
        Assertions.assertEquals(expected_description,actual_description);
    }
}
