import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImdbAddDataTest extends ImdbTest{


    @Override
    public Imdb createPage(){
        return new ImdbAddData(driver);
    }

    @Override
    public ImdbAddData getPage(){


        return (ImdbAddData)super.getPage();
    }

    @Test
    @Description("IMDB_testing.xlsx: TC5")
    public void createNewListTest(){
        String name = "My list";
        String description = "Monika's list";
        String type = "Titles";
        Boolean publicList = true;

        getPage().signIn();
        getPage().createNewListInit();
        getPage().createNewListFillData(name,description,type,publicList);
        String actual = getPage().getAddDataActual();

        Assertions.assertEquals(name,actual);
    }
}
