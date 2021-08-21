import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImdbModifyData extends Imdb {
    public static final By TITLE = By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div[1]/div[2]/textarea");
    //public static final By TITLE = By.xpath("//div[@name='listTitle' and text()='My list']");
    public static final By DESCRIPTION = By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div[2]/div[1]");
    public static final By MODIFY_ACTUAL_NAME = By.xpath("//*[@id=\"main\"]/div/h1");
    public static final By MODIFY_ACTUAL_DESCRIPTION = By.xpath("//*[@id=\"main\"]/div/div[2]/p");

    public ImdbModifyData(WebDriver driver) {
        super(driver);
    }

    public void modifyDataInit(String name){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(YOUR_LISTS).click();


        WebElement listNameA = driver.findElement(By.xpath("//a[@class=\"list-name\" and text()='" + name + "']"));
        WebElement parentLi = listNameA.findElement(By.xpath("./.."));
        String listId = parentLi.getAttribute("id");
        WebElement threePoints = driver.findElement(By.xpath("//div[@class=\"vertical-ellipsis\" and @id=\"" + listId + "\"]"));

        threePoints.click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pop-up-dialog') and @id=\"" + listId + "\"]")));

        WebElement editList = driver.findElement(By.xpath("//div[contains(@class,'pop-up-dialog') and @id=\"" + listId + "\"]//a[text()='Edit']"));
        editList.click();




    }

    public void modifyData(String name, String description){
        driver.findElement(TITLE).sendKeys(name);

        driver.findElement(DESCRIPTION).sendKeys(description);
        driver.findElement(DONE_BUTTON).click();
    }
    public String getModifyActualName(){
        return driver.findElement(MODIFY_ACTUAL_NAME).getText();

    }

    public String getModifyActualDescription(){

        return driver.findElement(MODIFY_ACTUAL_DESCRIPTION).getText();
    }
}
