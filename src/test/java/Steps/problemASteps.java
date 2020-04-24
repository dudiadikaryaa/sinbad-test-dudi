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
}
