package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.nio.channels.spi.AbstractSelector;

public class LoginToWalletSteps extends BaseSteps{
    public LoginToWalletSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    public LoginToWalletSteps whenEnterPhoneNumber(String phoneNumber){
        trueMoneyLoginScreen.enterPhonenumber(phoneNumber);
        return this;
    }
    public LoginToWalletSteps andClickSignOnButton()
    {
        trueMoneyLoginScreen.pressContinueButton();
        return this;
    }
    public LoginToWalletSteps andEnterPassword(String password){
        enterPasswordScreen.clickToPinEntry();
        enterPasswordScreen.enterPassword(password);
        return this;
    }
    public LoginToWalletSteps thenIcanSeeWelcomeText(String welcomeText){
        Assert.assertEquals(trueMoneyHomeScreen.getWelcomeText(),welcomeText);
        return this;
    }

}
