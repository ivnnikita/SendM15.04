import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    public String baseUrl = "https://ok.ru/";

    public void driverInit() {
        System.setProperty("webdriver.chrome.driver", "C:\\configs\\chromedriver.exe");
        open(baseUrl);
    }

}
