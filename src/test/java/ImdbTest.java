import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class ImdbTest {

    WebDriver driver;
    Imdb page;

    @BeforeEach
    public void Setup()
    {


        /*if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\Selenium\\chromedriver.exe");
        }*/
        WebDriverManager.chromedriver().setup();

        String fileDownloadPath = "C:\\Users\\Kiss Mónika\\IdeaProjects\\IMDB_test_automation\\src\\test\\resources";

        Map<String, Object> prefsMap = new HashMap<String, Object>();
        prefsMap.put("profile.default_content_settings.popups", 0);
        prefsMap.put("download.default_directory", fileDownloadPath);

        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("prefs", prefsMap);
        option.addArguments("--test-type");
        option.addArguments("--disable-extensions");


        driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        page = createPage();
        page.start();




    }
    public abstract Imdb createPage();
    public Imdb getPage(){
        return page;
    }

    @AfterEach
    public void Close()
    {
        driver.close();
    }
}
