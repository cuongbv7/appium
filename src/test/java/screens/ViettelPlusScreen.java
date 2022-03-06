package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ViettelPlusScreen extends BaseScreen{
    public ViettelPlusScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    By themeVietelPlus = By.id("com.vttm.vietteldiscovery:id/btnViettelPlus");
    By tvPoint = By.id("com.vttm.vietteldiscovery:id/tv_point");

    public void assertThemeViettelPlusDisplayed(){
        waitAndFindElement(themeVietelPlus);
    }
    public String getTvPoint(){
       return getText(tvPoint);
    }
}
