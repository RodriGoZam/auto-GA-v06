package uitesting.upb.org.pages;

import cucumber.api.java.gl.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NasaGetURL {
    WebDriver driver;

    By GettingStarted = By.id("tocify-header0");
    By APIlisting = By.id("tocify-header1");
    By Earth = By.id("tocify-header8");
    By Imagery = By.xpath("//*[@id=\"tocify-header8\"]/ul/li[1]");

    public NasaGetURL(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickGettingStarted(){
        driver.findElement(GettingStarted).click();
    }

    public void ClickAPIlisting(){
        driver.findElement(APIlisting).click();
    }

    public void ClickEarth() {
        driver.findElement(Earth).click();
    }

    public void ClickImagery() {
        driver.findElement(Imagery).click();
    }

    public void GetURL(){
        this.ClickGettingStarted();
        this.ClickAPIlisting();
        this.ClickEarth();
        this.ClickImagery();
    }
}
