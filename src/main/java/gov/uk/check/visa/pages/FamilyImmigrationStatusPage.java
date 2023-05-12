package gov.uk.check.visa.pages;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;

        }
    }


}
