package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ResonForTravelPage resonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        resonForTravelPage = new ResonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
    }

    @Test

    public void anAustralianCominToUKForTourism() throws InterruptedException{
        Thread.sleep(2000);
          startPage.clickStartNow();
          selectNationalityPage.selectNationality("Australia");
          selectNationalityPage.clickOnContinueButton();
          resonForTravelPage.selectTourism();
          resonForTravelPage.clickOnContinueButton1();
          resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException{
        Thread.sleep(2000);
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickOnContinueButton();
        resonForTravelPage.selectBusiness();
        resonForTravelPage.clickOnContinueButton1();
        durationOfStayPage.selectDuration();
        durationOfStayPage.clickOncontinue2();
        workTypePage.selectJobType();
        workTypePage.clickOnContinueButton3();
        resultPage.confirmMassage("You need a visa to work in health and care");
    }
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() throws InterruptedException{
        Thread.sleep(2000);
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickOnContinueButton();
        resonForTravelPage.selectReasonForVisit1("Join partner or family for a long stay");
        resonForTravelPage.clickOnContinueButton1();
        resultPage.getResultMessage3();


    }



}
