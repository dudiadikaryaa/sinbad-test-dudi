package Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.problemBSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class problemB {
    @Steps
    problemBSteps problemBSteps;

    @And("the user logs in")
    public void userLogIn(){
        problemBSteps.userLogin();
    }

    @When("the user clicks Visa button")
    public void userClickVisaButton(){
        problemBSteps.clickVisaButton();
    }

    @And("the user choose {word} as base country")
    public void userChooseBaseCountry(String countryName){
        problemBSteps.chooseBaseCountry(countryName);
    }

    @And("the user choose {word} as destination country")
    public void userChooseDestinationCountry(String countryName){
        problemBSteps.chooseDestinationCountry(countryName);
    }

    @And("the user choose visa date {word}")
    public void userChooseVisaDate(String visaDate){
        problemBSteps.chooseVisaDate(visaDate);
    }

    @And("the user clicks Submit button")
    public void userClickSubmitButton(){
        problemBSteps.clickSubmitButton();
    }

    @And("the user fill input fields Visa booking with {word}, {word}, {word}")
    public void userFillInputVisa(String firstName, String lastName, String phoneNumber){
        problemBSteps.fillInputVisa(firstName, lastName, phoneNumber);
    }

    @And("the user clicks Booking button")
    public void userClickBookingButton(){
        problemBSteps.clickBookingButton();
    }

    @And("the user clicks Show Invoice button")
    public void userClickShowInvoiceButton(){
        problemBSteps.clickShowInvoiceButton();
    }

    @Then("visa booking successfully submitted")
    public void visaBookingSubmitted(){
        problemBSteps.assertBookingSubmitted();
    }

    @Then("show booking invoice data {word}, {word}, {word}, {word}")
    public void showBookingInvoiceData(String firstName, String lastName, String phoneNumber, String visaDate){
        problemBSteps.assertBookingInvoice(firstName, lastName, phoneNumber, visaDate);
    }
}
