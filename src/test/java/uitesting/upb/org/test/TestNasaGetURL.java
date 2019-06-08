package uitesting.upb.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uitesting.upb.org.pages.NasaGetURL;

import java.util.concurrent.TimeUnit;

public class TestNasaGetURL {

    WebDriver webDriver;
    NasaGetURL nasaGetURL;

    @BeforeTest

    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.get("https://api.nasa.gov/");
    }

    @Test(priority = 0)

    public void test_Imagery_URL_Appears(){
        nasaGetURL.ClickGettingStarted();

    }
}
