package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainScreen  extends BaseScreen{

    public MainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    By vtplus = By.id("com.vttm.vietteldiscovery:id/btnViettelPlus");

    public void clickViettelPlus()
    {
        waitAndClick(vtplus);
    }

}
