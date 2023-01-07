package MyPOMProject;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBase {
    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
