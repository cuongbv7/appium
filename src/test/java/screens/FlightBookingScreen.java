package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightBookingScreen extends BaseScreen{

    public FlightBookingScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
  // String  localFlightBookingName = "Đặt vé máy bay Nội địa";
    By localFlightBookingName = By.id("vn.com.truemoney.vnwallet:id/tvContent");
    public void selectLocalFlightBooking(){

        waitAndClick(localFlightBookingName);
    }
}
