public class ImdbExportDataTest extends ImdbTest{

    @Override
    public Imdb createPage(){
        return new ImdbExportData(driver);
    }

    @Override
    public ImdbExportData getPage(){

        //castolás
        return (ImdbExportData) super.getPage();
    }
}
