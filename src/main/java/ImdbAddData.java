import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImdbAddData extends Imdb {



    public static final By CREATE_A_NEW_LIST_BUTTON = By.xpath("//*[@id=\"sidebar\"]/div[3]/a/button");
    public static final By LIST_CREATE_NAME = By.id("list-create-name");
    public static final By LIST_CREATE_DESCRIPTION = By.id("list-create-description");
    public static final By LIST_CREATE_TYPE = By.id("list-create-type");
    public static final By LIST_CREATE_PUBLIC_CHECKBOX = By.xpath("//*[@id=\"list-create-form\"]/div[4]/label");
    public static final By CREATE_BUTTON = By.xpath("//*[@id=\"list-create-form\"]/button");


    public static final By ADD_DATA_ACTUAL = By.xpath("//*[@id=\"main\"]/div/h1");

    public ImdbAddData(WebDriver driver) {
        super(driver);
    }

    public void createNewListInit(){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(YOUR_LISTS).click();
        driver.findElement(CREATE_A_NEW_LIST_BUTTON).click();
    }

    public void createNewListFillData(String name, String description, String type, Boolean publicList){
        driver.findElement(LIST_CREATE_NAME).sendKeys(name);
        driver.findElement(LIST_CREATE_DESCRIPTION).sendKeys(description);
        driver.findElement(LIST_CREATE_TYPE).sendKeys(type);

        if (publicList == false) {
        driver.findElement(LIST_CREATE_PUBLIC_CHECKBOX).click();
        }

        driver.findElement(CREATE_BUTTON).click();
        driver.findElement(DONE_BUTTON).click();

    }

    public String getAddDataActual(){
        return driver.findElement(ADD_DATA_ACTUAL).getText();

    }
}
