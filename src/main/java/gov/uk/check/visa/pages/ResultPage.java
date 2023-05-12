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
public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='What are you coming to the UK to do?']")
    WebElement resultsMassage;


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement confirmMassage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement needVisa;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement message2;


    public String getResultMessage() {
        Reporter.log("Verify text" + message2 + "<br>");
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(resultsMassage);
    }

    public void confirmResultMessage(String expectedMessage) {
        Reporter.log("confirmResultMessage" + confirmMassage + "<br>");
        CustomListeners.test.log(Status.PASS, "ConfirmResultMessage" + confirmMassage);
        verifyThatTextIsDisplayed(confirmMassage, "You will not need a visa to come to the UK");
    }

    public void confirmMassage(String expectedMessage) {
        Reporter.log("ConfirmMassage" + needVisa + "<br>");
        CustomListeners.test.log(Status.PASS, "Confirm Masssage" + needVisa);
        verifyThatTextIsDisplayed(needVisa, "You need a visa to work in health and care");
    }

    public String getResultMessage2() {
        Reporter.log("Verify text" + message2 + "<br>");
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(message2);
    }

    public String getResultMessage3() {
        Reporter.log("Verify text" + message2 + "<br>");
        CustomListeners.test.log(Status.PASS, "verify text message");
        return getTextFromElement(message2);
    }


}






