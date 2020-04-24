package Pages;

import net.thucydides.core.pages.PageObject;
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
        waitForCondition().until(ExpectedConditions.elementToBeClickable(destinationField));
        element(destinationField).shouldBeVisible();
        destinationField.click();

        element(inputCityNameField).shouldBeVisible();
        inputCityNameField.sendKeys(cityName);

        //Wait for the search to finisih
        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        element(bandungOption).shouldBeVisible();
        bandungOption.click();
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
        waitForCondition().until(ExpectedConditions.elementToBeClickable(buttonModify));
        element(cityTitleText).shouldBeVisible();
        String cityText = cityTitleText.getText();

        assertEquals("Failure - strings are not equal", cityName, cityText);
    }
}
