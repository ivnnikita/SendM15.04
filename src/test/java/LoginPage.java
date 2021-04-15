import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private static final String LOGIN_LOCATOR = ".//input[@id='field_email']";
    private static final String PASSWORD_LOCATOR = ".//input[@id='field_password']";
    private static final String SIGN_IN_LOCATOR = ".//*[contains(@data-l, \"sign_in\")]";

    private static void clear() {
        $x(LOGIN_LOCATOR).clear();
        $x(PASSWORD_LOCATOR).clear();
    }

    public static UserPage signIn(String username, String password) {
        clear();
        $x(LOGIN_LOCATOR).should(Condition.exist).sendKeys(username);
        $x(PASSWORD_LOCATOR).should(Condition.exist).sendKeys(password);
        $x(SIGN_IN_LOCATOR).click();
        sleep(1000);
        return new UserPage();
    }
}
