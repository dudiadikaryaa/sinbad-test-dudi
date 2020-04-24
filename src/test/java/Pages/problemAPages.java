package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Helper.credentials;

import static org.junit.Assert.assertEquals;

public class problemAPages extends PageObject{

    //Input City Name Destination
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[1]/div/div[2]/div/a")
    WebElement destinationField;

    @FindBy(xpath = "/html/body/div[6]/div/input")
    WebElement inputCityNameField;

    @FindBy(xpath = "/html/body/div[6]/ul/li/ul/li/div")
    WebElement bandungOption;

    public void inputCityName(String cityName){
        try { Thread.sleep(8000); }
        catch (InterruptedException io){ }
//        waitForCondition().until(ExpectedConditions.elementToBeClickable(destinationField));
        element(destinationField).shouldBeVisible();
        destinationField.click();

        try { Thread.sleep(3000); }
        catch (InterruptedException io){ }

        element(inputCityNameField).shouldBeVisible();
        inputCityNameField.sendKeys(cityName);

        //Wait for the search to finisih
        try { Thread.sleep(10000); }
        catch (InterruptedException io){ }

        element(bandungOption).shouldBeVisible();
        bandungOption.click();
    }

    //Choose Checkin Date
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[2]/div/div/div[1]/div/div[2]/input")
    WebElement checkinDateField;

    public void chooseCheckInDate(String checkinDate){
        element(checkinDateField).shouldBeVisible();
        checkinDateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        checkinDateField.sendKeys(Keys.chord(Keys.BACK_SPACE));
        checkinDateField.sendKeys(checkinDate);
    }

    //Choose Checkout Date
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[2]/div/div/div[2]/div/div[2]/input")
    WebElement checkoutDateField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]")
    WebElement backgroundPicture;

    public void chooseCheckOutDate(String checkoutDate){
        element(checkoutDateField).shouldBeVisible();
        checkoutDateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        checkoutDateField.sendKeys(Keys.chord(Keys.BACK_SPACE));
        checkoutDateField.sendKeys(checkoutDate);
        backgroundPicture.click();
    }

    //Add Child Count
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")
    WebElement addChildButton;

    public void addChildCount(String childCount){
        if (childCount.equals("1")){
            element(addChildButton).shouldBeVisible();
            addChildButton.click();
        }else if(childCount.equals("2")){
            element(addChildButton).shouldBeVisible();
            addChildButton.click();
            addChildButton.click();
        }
    }

    //Click Search Button
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div/form/div/div/div[4]/button")
    WebElement searchButton;

    public void clickSearch(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(searchButton));
        element(searchButton).shouldBeVisible();
        searchButton.click();
    }

    //Assert Search Result
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[1]/div[1]/h3/span[2]")
    WebElement cityTitleText;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[1]/div[2]/button")
    WebElement buttonModify;

    public void assertSearchResult(String cityName){
        try { Thread.sleep(8000); }
        catch (InterruptedException io){ }

        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonModify));
        element(cityTitleText).shouldBeVisible();
        String cityText = cityTitleText.getText();

        assertEquals("Failure - strings are not equal", cityName, cityText);
    }

    //Filter Price High to Low
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[1]/div[1]/h3/span[2]")
    WebElement titleResults;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/ul/li[2]/div/div")
    WebElement secondRowResults;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[1]/aside/div[1]/div/div/form/div[3]/div[2]/div/div[1]/label")
    WebElement highToLowFilter;

    public void filterPriceHigh(){

        //Scroll
        try { Thread.sleep(5000); }
        catch (InterruptedException io){ }
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-50);", secondRowResults);

        //Choosing the Filter
        element(highToLowFilter).shouldBeVisible();
        highToLowFilter.click();

        //Scroll back to top
        try { Thread.sleep(1000); }
        catch (InterruptedException io){ }
        js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0,-50);", titleResults);
    }

    //Choose Top Hotel
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/ul/li[16]/div/div/div[2]/div/div[1]/div/div[1]/h5")
    WebElement topTitleButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/section/div/div[2]/div[2]/div/div[2]/ul/li[16]/div/div/div[2]/div/div[3]/div/div[2]/form/button")
    WebElement detailTopButton;

    public void chooseTopHotel(){
//        element(topTitleButton).shouldBeVisible();
//        topTitleButton.click();

        element(detailTopButton).shouldBeVisible();
        detailTopButton.click();

        try { Thread.sleep(5000); }
        catch (InterruptedException io){ }
    }

    //Choose Most Expensive Room
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/a")
    WebElement buttonForWait;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/ul/li[3]/a")
    WebElement roomsOptionButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[2]/form/button")
    WebElement bookMostExpRoomButton;

    public void chooseMostExpRoom(){
        try { Thread.sleep(5000); }
        catch (InterruptedException io){ }

        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonForWait));
        element(roomsOptionButton).shouldBeVisible();
        roomsOptionButton.click();

        element(bookMostExpRoomButton).shouldBeVisible();
        bookMostExpRoomButton.click();
    }

    //Assert on Checkout Booking Page
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/a")
    WebElement loginButton; //for wait element

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/h4")
    WebElement termTitle;

    public void assertOnCheckoutBooking(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(loginButton));
        element(termTitle).shouldBeVisible();
        String termText = termTitle.getText();

        assertEquals("Failure - strings are not equal", "Please read the terms before proceed", termText);
    }
}
