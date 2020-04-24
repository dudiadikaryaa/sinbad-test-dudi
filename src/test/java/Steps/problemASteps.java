package Steps;

import Pages.problemAPages;
import net.thucydides.core.annotations.Step;

public class problemASteps {
    problemAPages problemAPages;

    //Open PHPTravels Webpage
    @Step
    public void openWebTravel(){
        problemAPages.open();
    }

    //Input & Choose City Name Destination
    @Step
    public void inputCityName(String cityName){
        problemAPages.inputCityName(cityName);
    }

    //Add Child Count
    @Step
    public void addChildCount(String childCount){
        problemAPages.addChildCount(childCount);
    }

    //Choose Checkin Date
    @Step
    public void chooseCheckInDate(String checkinDate){
       problemAPages.chooseCheckInDate(checkinDate);
    }

    //Choose Checkout Date
    @Step
    public void chooseCheckOutDate(String checkoutDate){
        problemAPages.chooseCheckOutDate(checkoutDate);
    }

    //Click Search Button
    @Step
    public void clickSearch(){
        problemAPages.clickSearch();
    }

    //Assert Search Result
    @Step
    public void assertSearchResult(String cityName){
        problemAPages.assertSearchResult(cityName);
    }

    //Filter Price High to Low
    @Step
    public void filterPriceHigh(){
        problemAPages.filterPriceHigh();
    }

    //Choose Top Hotel
    @Step
    public void chooseTopHotel(){
        problemAPages.chooseTopHotel();
    }

    //Choose Most Expensive Room
    @Step
    public void chooseMostExpRoom(){
        problemAPages.chooseMostExpRoom();
    }

    //Assert on Checkout Booking Page
    @Step
    public void assertOnCheckoutBooking(){
        problemAPages.assertOnCheckoutBooking();
    }
}
