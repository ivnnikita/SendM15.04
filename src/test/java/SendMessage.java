import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class SendMessage extends BaseTest{
    String username = "+79500071367";
    String password = "123QWE";

    @Before
    public void setup() {
        driverInit();
    }

    @Test
    public void sendingMessageTest() {
        LoginPage.signIn(username, password);
        UserPage.gotoFriendsPage();
        FriendsPage.choosefriend();
        UserFrendsPage.sendM();
    }
    @After
    public void end() {
        sleep(5000);
    }
}