package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FlightBookingSteps extends BaseSteps{

    public FlightBookingSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public FlightBookingSteps whenIgotoFlightBooking(){
        trueMoneyHomeScreen.gotoFlightBooking();
        return this;
    }
    public FlightBookingSteps andIselectLocalFlight(){
        flightBookingScreen.selectLocalFlightBooking();
        return this;
    }
    public FlightBookingSteps thenIShouldSeeLocalFlightScreen(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
