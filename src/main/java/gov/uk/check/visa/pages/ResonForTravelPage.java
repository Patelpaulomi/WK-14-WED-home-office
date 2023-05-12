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
public class ResonForTravelPage extends Utility {
    public ResonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue1;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement business;

    @CacheLookup
    @FindBy(css = "#response-4")
    WebElement clickOnJoinPartnerVisa;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']") //button[contains(text(),'Continue')]
    WebElement clickOnNextButton;

    public void selectTourism() {
        Reporter.log("SelectTourism" + tourism.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "SelectTourism" + tourism);
        clickOnElement(tourism);
    }

    public void clickOnContinueButton1() {
        Reporter.log("Clicking on Continue Button" + clickOnContinue1.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Clicking on Continue Button" + clickOnContinue1);
        clickOnElement(clickOnContinue1);
    }

    public void selectBusiness() {
        Reporter.log("Select Business" + business.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select Business" + business);
        clickOnElement(business);
    }

    public void selectReasonForVisit1(String reason) {
        Reporter.log("click on Join partner visa" + clickOnJoinPartnerVisa);
        clickOnElement(clickOnJoinPartnerVisa);
        CustomListeners.test.log(Status.PASS, "click on Join partner visa");

    }

    public void clickNextStepButton() {
        Reporter.log("Click on continue button" + clickOnNextButton);
        clickOnElement(clickOnNextButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button" + clickOnNextButton);
    }


}
