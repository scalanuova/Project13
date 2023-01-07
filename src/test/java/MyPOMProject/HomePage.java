package MyPOMProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    @FindBy(xpath = "//html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
    public WebElement HomePageText;
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newCustomerButton;


    public String getHomePageText(){
        driverWait.until(ExpectedConditions.visibilityOf(HomePageText));
        return HomePageText.getText();
    }
    public void clickToNewCustomer(){
        driverWait.until(ExpectedConditions.elementToBeClickable(newCustomerButton)).click();
    }
}
