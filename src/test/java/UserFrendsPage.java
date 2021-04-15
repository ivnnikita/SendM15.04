import static com.codeborne.selenide.Selenide.*;

public class UserFrendsPage {

    private static final String ButtonM =".//div[@id='hook_Block_MainMenu']//*[contains(@data-l, 'sendMessage')]";

    public static void sendM(){
        $x(ButtonM).click();
    }

}
