package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.*;

public class BaseSteps {

    protected TrueMoneyLoginScreen trueMoneyLoginScreen;
    protected EnterPasswordScreen enterPasswordScreen;
    protected TrueMoneyHomeScreen trueMoneyHomeScreen;
    protected FlightBookingScreen flightBookingScreen;
    public BaseSteps(AndroidDriver<MobileElement> driver) {
       // splashScreen = new SplashScreen(driver);
        //selectionScreen = new SelectionScreen(driver);
       // candidateMainScreen = new CandidateMainScreen(driver);
        //jobScreen = new JobScreen(driver);
        //mainScreen = new MainScreen(driver);
        //viettelPlusScreen = new ViettelPlusScreen(driver);
        trueMoneyLoginScreen = new TrueMoneyLoginScreen(driver);
        enterPasswordScreen = new EnterPasswordScreen(driver);
        trueMoneyHomeScreen = new TrueMoneyHomeScreen(driver);
        flightBookingScreen = new FlightBookingScreen(driver);
    }
}