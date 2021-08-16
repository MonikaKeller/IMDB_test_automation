public class ImdbExportDataTest extends ImdbTest{

    @Override
    public Imdb getPage(){
        return new ImdbExportData(driver);
    };
}
