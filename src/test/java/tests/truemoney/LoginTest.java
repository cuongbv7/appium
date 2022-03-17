package tests.truemoney;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void SucessLoginTest(){
        steps.loginToWalletSteps.whenEnterPhoneNumber("0979128292")
                .andClickSignOnButton()
                .andEnterPassword("121090")
                .thenIcanSeeWelcomeText("Xin chào, Bùi Việt Cường!");
    }
}
