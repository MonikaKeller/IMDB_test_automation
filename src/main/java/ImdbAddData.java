import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbAddData extends Imdb {

    //Your List
    public static final By CREATE_YOUR_LIST = By.xpath("");
    //*[@id="navUserMenu-contents"]/ul/a[5]
    public static final By LIST_CREATE_NAME = By.id("list-create-name");
    public static final By LIST_CREATE_DESCRIPTION = By.id("list-create-description");
    public static final By LIST_CREATE_TYPE = By.id("list-create-type");
    public static final By LIST_CREATE_PUBLIC_CHECKBOX = By.xpath("//*[@id=\"list-create-form\"]/div[4]/label");
    public static final By CREATE_BUTTON = By.xpath("//*[@id=\"list-create-form\"]/button");
    public static final By ADD_TO_LIST_SEARCH = By.id("add-to-list-search");
    public static final By DONE_BUTTON = By.xpath("//*[@id=\"main\"]/div[1]/button");

    public ImdbAddData(WebDriver driver) {
        super(driver);
    }


}
