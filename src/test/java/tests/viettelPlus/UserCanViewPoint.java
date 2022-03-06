package tests.viettelPlus;

import org.testng.annotations.Test;
import tests.BaseTest;

public class UserCanViewPoint extends BaseTest {

    @Test
    public void userCanViewPoint()
    {
        steps.viettelPlusSteps.whenIClickViettelPlus().thenIcanSeeMyScore();

    }
}
