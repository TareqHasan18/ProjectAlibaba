package AlibabaPages;

import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends CommonAPI {

    @FindBy(xpath = "//div/span[text()='Home & Garden']")
    public static WebElement homeAndGardenWebelement;

    @FindBy(xpath = "//div/span[text()='Beauty & Personal Care']")
    public static WebElement beautyAndPersonalCareWebelement;








    public void clickHomeAndGarden() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeAndGardenWebelement.click();
        Thread.sleep(3000);
    }

    public void clickBeautyAndPersonalCare() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        beautyAndPersonalCareWebelement.click();
        Thread.sleep(3000);
    }


}
