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
public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement duration;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continue2;

    public void selectDuration() {
        Reporter.log("Select Duration" + duration.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select Duration");
        clickOnElement(duration);
    }

    public void clickOncontinue2() {
        Reporter.log("Click On Continue2" + continue2 + "<br>");
        clickOnElement(continue2);
    }
}
