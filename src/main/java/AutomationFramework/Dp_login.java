package AutomationFramework;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Dp_login {
    @DataProvider(name = "invalidLogin")
    public static Object[][] getInvalidLoginDate() throws IOException {
        return new Object[][]{
                {"GB_01", "Invalid_Login", "tyftfytf", "fyuggohuhj"},
                {"GB_02", "Invalid_Login", "ynkjjko", "Test123S$"},
                {"GB_03", "Invalid_Login", "icttest@rediffmail.com", "vyuggg"},

        };
    }

    @DataProvider(name = "validLogin")
    public static Object[][] getValidLoginData() throws IOException {
        return new Object[][]{
                {"GB_O4", "Valid_Login", "ayshashanu", "Shameen123s$"}


        };

    }
}