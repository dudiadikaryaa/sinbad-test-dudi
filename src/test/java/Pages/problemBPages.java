package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Helper.credentials;

import static org.junit.Assert.assertEquals;

public class problemBPages extends PageObject{

    credentials credentials;

    //User Login
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a")
    WebElement dropdownAccount;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/div[3]/div[1]/label/input")
    WebElement emailInputField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/div[3]/div[2]/label/input")
    WebElement passwordInputField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/button")
    WebElement submitLoginButton;

    public void userLogin(){
        try { Thread.sleep(3000); }
        catch (InterruptedException io){ }

        String email = credentials.user_email;
        String password = credentials.user_password;

        element(dropdownAccount).shouldBeVisible();
        dropdownAccount.click();

        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        loginButton.click();

        waitForCondition().until(ExpectedConditions.elementToBeClickable(submitLoginButton));
        element(emailInputField).shouldBeVisible();

        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        emailInputField.sendKeys(email);

        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        passwordInputField.sendKeys(password);

        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        submitLoginButton.click();

        try { Thread.sleep(10000); }
        catch (InterruptedException io){ }
    }

    //Click Visa Button
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div/div/nav/ul[2]/li[1]/a")
    WebElement visaButton;

    public void clickVisaButton(){
        try { Thread.sleep(3000); }
        catch (InterruptedException io){ }

        waitForCondition().until(ExpectedConditions.elementToBeClickable(visaButton));
        visaButton.click();

        try { Thread.sleep(3000); }
        catch (InterruptedException io){ }
    }

    //Choose Base Country
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[1]/div/div[2]/div/a")
    WebElement chooseBaseButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[1]/div/div[2]/div/div/div/input")
    WebElement inputCountryNameField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[1]/div/div[2]/div/div/ul/li")
    WebElement choosenCountryOption;

    public void chooseBaseCountry(String countryName){
        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        element(chooseBaseButton).shouldBeVisible();
        chooseBaseButton.click();

        element(inputCountryNameField).shouldBeVisible();
        inputCountryNameField.sendKeys(countryName);

        element(choosenCountryOption).shouldBeVisible();
        choosenCountryOption.click();
    }

    //Choose Destination Country
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[2]/div/div[2]/div/a")
    WebElement chooseDestButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[2]/div/div[2]/div/div/div/input")
    WebElement inputDestNameField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[2]/div/div[2]/div/div/ul/li")
    WebElement choosenDestOption;

    public void chooseDestinationCountry(String countryName){
        element(chooseDestButton).shouldBeVisible();
        chooseDestButton.click();

        element(inputDestNameField).shouldBeVisible();
        inputDestNameField.sendKeys(countryName);

        element(choosenDestOption).shouldBeVisible();
        choosenDestOption.click();
    }

    //Choose Visa Date
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[3]/div/div[2]/input")
    WebElement inputFieldVisaDate;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]")
    WebElement backgroundPicture;

    public void chooseVisaDate(String visaDate){
        element(inputFieldVisaDate).shouldBeVisible();
        inputFieldVisaDate.sendKeys(visaDate);
        backgroundPicture.click();
    }

    //Click Submit Button
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[5]/div/div/form/div/div/div[4]/button")
    WebElement submitButton;

    public void clickSubmitButton(){
        element(submitButton).shouldBeVisible();
        submitButton.click();
    }

    //Fill Input Visa
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[1]/div[1]/div/label/input")
    WebElement firstNameField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[1]/div[2]/label/input")
    WebElement lastNameField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[2]/div[1]/label/input")
    WebElement emailField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[2]/div[2]/label/input")
    WebElement confirmEmailField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[3]/div[1]/label/input")
    WebElement phoneNumberField;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div/div/form/div[5]/div/button")
    WebElement bookingButton;

    public void fillInputVisa(String firstName, String lastName, String phoneNumber, String emailUser){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(bookingButton));

        element(firstNameField).shouldBeVisible();
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(emailUser);
        confirmEmailField.sendKeys(emailUser);
        phoneNumberField.sendKeys(phoneNumber);
    }

    //Click Booking Button
    public void clickBookingButton(){
        try { Thread.sleep(2000); }
        catch (InterruptedException io){ }

        element(bookingButton).shouldBeVisible();
        bookingButton.click();

        try { Thread.sleep(3000); }
        catch (InterruptedException io){ }
    }

    //Click Show Invoice Button
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/strong/a")
    WebElement showInvoiceButton;

    public void clickShowInvoiceButton(){
        waitForCondition().until(ExpectedConditions.elementToBeClickable(showInvoiceButton));
        element(showInvoiceButton).shouldBeVisible();
        showInvoiceButton.click();
    }

    //Assert Booking Submitted
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/h4[1]/strong")
    WebElement submittedText;

    public void assertBookingSubmitted(){
        element(submittedText).shouldBeVisible();
        String submitText = submittedText.getText();

        assertEquals("Failure - strings are not equal", "Visa Submitted", submitText);
    }

    //Assert Submitted Visa Invoice
    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/h3/span")
    WebElement bookingDetailsTitle;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[1]/span[2]")
    WebElement firstNameValue;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[2]/span[2]")
    WebElement lastNameValue;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[3]/span[2]")
    WebElement phoneNumberValue;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[4]/span[2]")
    WebElement baseCountryValue;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[5]/span[2]")
    WebElement destCountryValue;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/ul/li[7]/span[2]")
    WebElement visaDateValue;

    public void assertBookingInvoice(String firstName, String lastName, String phoneNumber, String visaDate, String baseCountry, String destinationCountry){
        element(bookingDetailsTitle).shouldBeVisible();

        String firstNameText = firstNameValue.getText();
        String lastNameText = lastNameValue.getText();
        String phoneText = phoneNumberValue.getText();
        String baseCountryText = baseCountryValue.getText();
        String destCountryText = destCountryValue.getText();
        String visaDateText = visaDateValue.getText();

        assertEquals("Failure - strings are not equal", firstName, firstNameText);
        assertEquals("Failure - strings are not equal", lastName, lastNameText);
        assertEquals("Failure - strings are not equal", phoneNumber, phoneText);
        assertEquals("Failure - strings are not equal", baseCountry, baseCountryText);
        assertEquals("Failure - strings are not equal", destinationCountry, destCountryText);
        assertEquals("Failure - strings are not equal", visaDate, visaDateText);
    }
}
