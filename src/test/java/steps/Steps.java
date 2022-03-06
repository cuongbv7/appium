package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps {
    public JobDetailsSteps jobDetailsSteps;
    public ViettelPlusSteps viettelPlusSteps;
    public Steps (AndroidDriver<MobileElement> driver){
        this.jobDetailsSteps = new JobDetailsSteps(driver);
        this.viettelPlusSteps = new ViettelPlusSteps(driver);

    }
}