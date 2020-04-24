package Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.problemASteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class problemA {
    @Steps
    problemASteps problemASteps;

    @Given("the user opens PHPTravels Web")
    public void userOpenTravelWeb(){
        problemASteps.openWebTravel();
    }

    @When("the user input {word} in destination field")
    public void userInputCityDestination(String cityName){
        problemASteps.inputCityName(cityName);
    }

    @And("the user add child field by {word}")
    public void userAddChildField(String childCount){
        problemASteps.addChildCount(childCount);
    }

    @And("the user clicks Search button")
    public void userClickSearch(){
        problemASteps.clickSearch();
    }

    @And("the user choose check-in date {word}")
    public void userChooseCheckInDate(String checkinDate){
        problemASteps.chooseCheckInDate(checkinDate);
    }

    @And("the user choose check-out date {word}")
    public void userChooseCheckOutDate(String checkoutDate){
        problemASteps.chooseCheckOutDate(checkoutDate);
    }

    @And("the user clicks High to Low filter")
    public void userFilterPriceHigh(){
        problemASteps.filterPriceHigh();
    }

    @And("the user choose most top hotel")
    public void userChooseMostTopHotel(){
        problemASteps.chooseTopHotel();
    }

    @And("the user choose most expensive room")
    public void userChooseMostExpensiveRoom(){
        problemASteps.chooseMostExpRoom();
    }

    @Then("show search results for {word}")
    public void showSearchResult(String cityName){
        problemASteps.assertSearchResult(cityName);
    }

    @Then("show checkout booking page")
    public void showCheckoutBookingPage(){
        problemASteps.assertOnCheckoutBooking();
    }


}
