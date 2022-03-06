package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class ViettelPlusSteps extends BaseSteps{
    public ViettelPlusSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    public ViettelPlusSteps whenIClickViettelPlus(){
        mainScreen.clickViettelPlus();
        return this;
    }
    public ViettelPlusSteps thenIcanSeeMyScore(){
        String mytvpoint = viettelPlusScreen.getTvPoint();
        Assert.assertEquals("2.081 điểm",mytvpoint);
        return this;
    }
}
