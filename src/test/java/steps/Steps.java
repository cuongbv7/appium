package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps {
    public LoginToWalletSteps loginToWalletSteps;
    public FlightBookingSteps flightBookingSteps;
    public Steps (AndroidDriver<MobileElement> driver){
        this.loginToWalletSteps = new LoginToWalletSteps(driver);
        this.flightBookingSteps = new FlightBookingSteps(driver);

    }
}