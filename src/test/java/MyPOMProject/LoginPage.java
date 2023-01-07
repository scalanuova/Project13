package MyPOMProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@name='uid']")
    public WebElement userIDBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@name='btnLogin']")
    public WebElement loginButton;
    @FindBy(xpath = "//h2[@class='barone']")
    public WebElement loginPageText;

    public String getLoginPageText(){
        return loginPageText.getText();
    }
    public void loginGuru(String userID, String password){
        userIDBox.sendKeys(userID);
        passwordBox.sendKeys(password);
        driverWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
