package AlibabaPagesTest;

import AlibabaPages.homePage;
import Base.CommonAPI;
import Reporting.TestLogger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homePageTest extends homePage {

    homePage objOfhomePage;
    @BeforeMethod
    public void Navigating(){
        objOfhomePage = PageFactory.initElements(driver, homePage.class);
    }

    @Test
    public void testHomeAndGarden() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHomeAndGarden();
    }

    @Test
    public void testBeautyAndPersonalCare() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBeautyAndPersonalCare();
    }



}
