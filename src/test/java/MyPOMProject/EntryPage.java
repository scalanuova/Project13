package MyPOMProject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EntryPage extends BasePage{
    @FindBy (xpath = "//input[@name='name']")
    public WebElement CustomerNameBox;
    @FindBy (xpath = "//input[@value='m']")
    public WebElement GenderBoxMale;
    @FindBy (xpath = "//input[@value='f']")
    public WebElement GenderBoxFemale;
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement DateOfBirth;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement AddressBox;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement CityBox;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement StateBox;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement PINBox;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement MobileNumberBox;
    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement EmailBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordBox;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement SubmitButton;
    @FindBy(xpath = "//p[@class='heading3']")
    public WebElement VerificationMessage;
    public void fillNewCustomer(String customerName, String Gender, String date, String address, String city, String State, String PIN, String number, String email, String password ){
        driverWait.until(ExpectedConditions.visibilityOf(CustomerNameBox)).sendKeys(customerName);
        if(Gender == "Male"){
            GenderBoxMale.click();
        } else if (Gender == "Female") {
            GenderBoxFemale.click();
        }
        DateOfBirth.sendKeys(date);
        AddressBox.sendKeys(address);
        CityBox.sendKeys(city);
        StateBox.sendKeys(State);
        PINBox.sendKeys(PIN);
        MobileNumberBox.sendKeys(number);
        EmailBox.sendKeys(email);
        PasswordBox.sendKeys(password);
        driverWait.until(ExpectedConditions.textToBePresentInElementValue(PasswordBox,password));
        SubmitButton.click();
    }
    public String getVerificationMessage(){return VerificationMessage.getText();}
}
