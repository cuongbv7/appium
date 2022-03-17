package screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait                wait;

    public BaseScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void waitAndClick(By by) { wait.until(ExpectedConditions.elementToBeClickable(by)).click(); }

    protected void scrollAndClickById(String resourceID) {
        // FindElement
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().resourceIdMatches(\""+resourceID +"\"))"));
        element.click();
        driver.findElements()
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }
    protected void waitAndClick(MobileElement element){
        System.out.println("wait and click");
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void waitAndClickById(String id){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(id))).click();
    }
    protected void waitAndClickByText(String text){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByName(text))).click();
    }
    protected void hideKeyboard() { driver.navigate().back(); }

    protected List<WebElement> waitAndFindElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected String getText(By by) {
        return waitAndFindElement(by).getText();
    }

    protected void sendKey(By by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }
}
