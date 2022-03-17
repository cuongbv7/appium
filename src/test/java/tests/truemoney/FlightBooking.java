package tests.truemoney;

import org.testng.annotations.Test;
import tests.BaseTest;

public class FlightBooking extends BaseTest {
    @Test
    public void localFlightBookingTest(){
        steps.loginToWalletSteps.whenEnterPhoneNumber("0979128292")
                .andClickSignOnButton()
                .andEnterPassword("121090")
                .thenIcanSeeWelcomeText("Xin chào, Mia!");
        steps.flightBookingSteps.whenIgotoFlightBooking()
                .andIselectLocalFlight().thenIShouldSeeLocalFlightScreen();
    }

}
