package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TrueMoneyLoginScreen extends BaseScreen{
    public TrueMoneyLoginScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    By enterPhoneNumber = By.id("vn.com.truemoney.vnwallet:id/et_phone_number");
    By signOnButton = By.id("vn.com.truemoney.vnwallet:id/bt_sign_up");

    public void enterPhonenumber(String phoneNumber){
        sendKey(enterPhoneNumber,phoneNumber);
    }
    public void pressContinueButton(){
        waitAndClick(signOnButton);
    }


}
