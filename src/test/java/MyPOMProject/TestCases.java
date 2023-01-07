package MyPOMProject;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCases extends TestBase {
    @Test
    public void TC(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru_url"));
        LoginPage loginPage = new LoginPage();
        String loginPageText = loginPage.getLoginPageText();
        Assert.assertEquals(loginPageText,"Guru99 Bank","Verification has failed");
        loginPage.loginGuru(PropertiesReadingUtil.getProperties("userID"),PropertiesReadingUtil.getProperties("password"));

        HomePage homePage = new HomePage();
        String homePageText = homePage.getHomePageText();
        Assert.assertTrue(homePageText.contains("mngr469687"), "Verification has failed");
        homePage.clickToNewCustomer();

        BrowserUtils.wait(3);

        String entryPageTitle = DriverUtil.getDriver().getTitle();
        Assert.assertTrue(entryPageTitle.contains("Entry Page"),"Verification has failed");
        EntryPage entryPage = new EntryPage();
        Faker faker = new Faker();
        entryPage.fillNewCustomer(faker.name().firstName(),faker.demographic().sex(),"1990-01-01",faker.address().streetAddress(),faker.address().city(),faker.address().state(),faker.number().digits(6),faker.number().digits(10), faker.internet().emailAddress(),faker.internet().password());
        String registeredText = entryPage.getVerificationMessage();
        Assert.assertTrue(registeredText.contains("Customer Registered Successfully"),"Verification has failed");
    }
}
