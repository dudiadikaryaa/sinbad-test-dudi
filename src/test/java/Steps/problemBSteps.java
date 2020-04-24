package Steps;

import Pages.problemBPages;
import net.thucydides.core.annotations.Step;

public class problemBSteps {
    problemBPages problemBPages;

    //User Login
    @Step
    public void userLogin(){
        problemBPages.userLogin();
    }

    //Click Visa Button
    @Step
    public void clickVisaButton(){
        problemBPages.clickVisaButton();
    }

    //Choose Base Country
    @Step
    public void chooseBaseCountry(String countryName){
        problemBPages.chooseBaseCountry(countryName);
    }

    //Choose Destination Country
    @Step
    public void chooseDestinationCountry(String countryName){
        problemBPages.chooseDestinationCountry(countryName);
    }

    //Choose Visa Date
    @Step
    public void chooseVisaDate(String visaDate){
        problemBPages.chooseVisaDate(visaDate);
    }

    //Click Submit Button
    @Step
    public void clickSubmitButton(){
        problemBPages.clickSubmitButton();
    }

    //Fill Input Visa
    @Step
    public void fillInputVisa(String firstName, String lastName, String phoneNumber){
        problemBPages.fillInputVisa(firstName,lastName,phoneNumber);
    }

    //Click Booking Button
    @Step
    public void clickBookingButton(){
        problemBPages.clickBookingButton();
    }

    //Click Show Invoice Button
    @Step
    public void clickShowInvoiceButton(){
        problemBPages.clickShowInvoiceButton();
    }

    //Assert Booking Submitted
    @Step
    public void assertBookingSubmitted(){
        problemBPages.assertBookingSubmitted();
    }

    //Assert Booking Invoice
    @Step
    public void assertBookingInvoice(String firstName, String lastName, String phoneNumber, String visaDate){
        problemBPages.assertBookingInvoice(firstName,lastName,phoneNumber,visaDate);
    }

}
