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
public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDown;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinueButton;


    public void selectNationality(String nationality) {
        Reporter.log("nationalityDropDown" + nationality.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Select Nationality" + nationalityDropDown);
        selectByVisibleTextFromDropDown(nationalityDropDown, nationality);

    }

    public void clickOnContinueButton() {
        Reporter.log("Clicking on Continue Button" + clickOnContinueButton.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click On Continue Button" + clickOnContinueButton);
        clickOnElement(clickOnContinueButton);
    }
}
