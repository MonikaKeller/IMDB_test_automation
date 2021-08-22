import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class ImdbTest {

    WebDriver driver;
    Imdb page;

    @BeforeEach
    public void Setup()
    {



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
