import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbDeleteData extends Imdb {

    public ImdbDeleteData(WebDriver driver) {
        super(driver);
    }

    public String deleteDataInit(String name){
        driver.findElement(PROFILE_BUTTON).click();
        driver.findElement(YOUR_LISTS).click();
        WebElement listNameA;
        try {
             listNameA = driver.findElement(By.xpath("//a[@class=\"list-name\" and text()='" + name + "']"));
        }
        catch(NoSuchElementException e){
            System.err.println("Nincs "+ name +" nevű lista!");
            throw e;

        }
            WebElement parentLi = listNameA.findElement(By.xpath("./.."));
            String listId = parentLi.getAttribute("id");
            WebElement threePoints = driver.findElement(By.xpath("//div[@class=\"vertical-ellipsis\" and @id=\"" + listId + "\"]"));

            threePoints.click();

            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'pop-up-dialog') and @id=\"" + listId + "\"]")));

            WebElement deleteList = driver.findElement(By.xpath("//div[contains(@class,'pop-up-dialog') and @id=\"" + listId + "\"]//a[text()='Delete this list']"));
            deleteList.click();

            WebDriverWait wait2 = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"" + listId + "\" and contains(@class,'pop-up-modal-option') and contains(@class,'confirm')]")));

            WebElement deleteAlert = driver.findElement(By.xpath("//a[@id=\"" + listId + "\" and contains(@class,'pop-up-modal-option') and contains(@class,'confirm')]"));
            deleteAlert.click();
            sleep(3000);

            return listId;
    }

    public boolean isListExists(String listId){
        try {
            driver.findElement(By.xpath("//li[@id=\"" + listId + "\" and data-list-type=\"Titles\"]/a[@class=\"list-name\"]"));
            return true;
        }
        catch(NoSuchElementException e){
           return false;
        }
    }
}
