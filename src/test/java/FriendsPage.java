import static com.codeborne.selenide.Selenide.*;

public class FriendsPage {
    private static final String friendCard = ".//ul[@class=\"ugrid_cnt\"]/*[@class=\"ugrid_i\"]";

    public static UserFrendsPage choosefriend() {
        $$x(friendCard).first().click();
        return new UserFrendsPage();
    }
}
