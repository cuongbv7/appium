package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);  //=>> udid of device, we can get by type 'adb devices' on terminal
        desiredCapabilities.setCapability("platformVersion", platformVersion); //=> android version
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "vn.com.truemoney.vnwallet");
        desiredCapabilities.setCapability("appActivity", "com.truemoney.vnwallet.splash.activity.activity.SplashActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}