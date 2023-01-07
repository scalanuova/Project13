package MyPOMProject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(10));
    public BasePage (){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
}
