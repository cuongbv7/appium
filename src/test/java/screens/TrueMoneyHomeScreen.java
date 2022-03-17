package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TrueMoneyHomeScreen extends BaseScreen{

    public TrueMoneyHomeScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    By welcome = By.id("vn.com.truemoney.vnwallet:id/tv_home_welcome");
    By tv_balance = By.id("vn.com.truemoney.vnwallet:id/tv_balance");
    String flight_tk = "vn.com.truemoney.vnwallet:id/tv_flight_ticket";

    public String getWelcomeText(){
        String welcomeText = getText(welcome);
        return welcomeText;
    }
    public String getBalance(){
        String balance = getText(tv_balance);
        return balance;
    }
    public FlightBookingScreen gotoFlightBooking(){
        scrollAndClickById(flight_tk);
        return new FlightBookingScreen(driver);
    }
}
