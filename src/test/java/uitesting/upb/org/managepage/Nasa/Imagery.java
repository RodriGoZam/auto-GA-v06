package uitesting.upb.org.managepage.Nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Imagery extends BasePage {

    @FindBy(xpath = "//*[@id=\"tocify-header0\"]/li")
    private WebElement GettingStarted_Button;

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li")
    private WebElement NasaAPIListing_Button;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/li")
    private WebElement Earth_Button;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul/li[1]")
    private WebElement Imagery_Button;

    public void ClickGettingStarted() {
        Events.click(GettingStarted_Button);
    }

    public void ClickAPI(){
        Events.click(NasaAPIListing_Button);
    }

    public void ClickEarth(){
        Events.click(Earth_Button);
    }

    public void ClickImagery(){
        Events.click(Imagery_Button);
    }

    public void GetURL() throws InterruptedException {
        ClickGettingStarted();
        Thread.sleep(1000);
        ClickAPI();
        Thread.sleep(1000);
        ClickEarth();
        Thread.sleep(1000);
        ClickImagery();

        String txt = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/p[57]/code")).getText();
        System.out.println(txt);


    }
}
