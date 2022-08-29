package base;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static base.BaseTest.driver;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.getLifecycle().addAttachment("screenshot", "image/png", "png"
                , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        driver.close();
        driver.quit();
    }
}
