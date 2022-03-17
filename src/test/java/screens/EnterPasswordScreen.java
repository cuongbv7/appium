package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

public class EnterPasswordScreen extends BaseScreen{

    public EnterPasswordScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    By pinEntry = By.id("vn.com.truemoney.vnwallet:id/et_pin_entry");

    public void clickToPinEntry(){
        waitAndClick(pinEntry);
    }

    public void enterPassword(String password){
        char[] ch = password.toCharArray();
        for (char c : ch){
            driver.getKeyboard().pressKey(String.valueOf(c));

        }
    }
}
