package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.*;

public class BaseSteps {
    protected SplashScreen        splashScreen;
    protected SelectionScreen     selectionScreen;
    protected CandidateMainScreen candidateMainScreen;
    protected JobScreen           jobScreen;
    protected MainScreen   mainScreen;
    protected ViettelPlusScreen   viettelPlusScreen;
    public BaseSteps(AndroidDriver<MobileElement> driver) {
        splashScreen = new SplashScreen(driver);
        selectionScreen = new SelectionScreen(driver);
        candidateMainScreen = new CandidateMainScreen(driver);
        jobScreen = new JobScreen(driver);
        mainScreen = new MainScreen(driver);
        viettelPlusScreen = new ViettelPlusScreen(driver);
    }
}