package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCare;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continue3;

    public void selectJobType() {
        Reporter.log("SelectTourism" + healthAndCare.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select Job Type" + healthAndCare);
        clickOnElement(healthAndCare);
    }

    public void clickOnContinueButton3() {
        Reporter.log("Clicking on Continue Button" + continue3.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click On Continue Button3" + continue3);
        clickOnElement(continue3);
    }


}
