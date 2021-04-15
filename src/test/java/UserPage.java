import static com.codeborne.selenide.Selenide.*;

public class UserPage {
    private static final String FRIENDS = ".//*[@id='hook_Block_HeaderTopFriendsInToolbar']//div[contains(@class,'i_ic')]";

    public static FriendsPage gotoFriendsPage(){
        $x(FRIENDS).click();
        return new FriendsPage();
    }
}
