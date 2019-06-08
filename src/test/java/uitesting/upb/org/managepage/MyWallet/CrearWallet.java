package uitesting.upb.org.managepage.MyWallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CrearWallet extends BasePage {

    /*@FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/nav/nav/div/button")
    private WebElement ClickNavBar;

    @FindBy(css = "//*[@id=\"botonReporte\"]")
    private WebElement ClickAddCuenta;*/

    @FindBy(xpath = "//*[@id=\"nombre\"]")
    private WebElement WalletNameTextField;

    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/form/div[2]/div/button")
    private WebElement CreateWalletButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[9]/main/div/div/nav/nav/div/button")
    private WebElement ClickNavBar;

    @FindBy(xpath = "//*[@id=\"app\"]/div[10]/main/div/div/nav/aside/div[1]/div[2]/a/div[2]")
    private WebElement ClickAccount;





    public CrearWallet InsertNameTextField (String name) throws InterruptedException {
        Events.fillField(WalletNameTextField, name);
        Thread.sleep(1000);
        return this;
    }

    public void ClickCrearWallet() {
        Events.click(CreateWalletButton);
    }

    public void ClickNavBar() {
        Events.click(ClickNavBar);
    }

    public void ClickAccount(){
        Events.click(ClickAccount);
    }


    public void AddNewWallet(String name) throws InterruptedException {
        InsertNameTextField(name).ClickCrearWallet();
        Thread.sleep(1000);
        ClickNavBar();
        Thread.sleep(1000);
        ClickAccount();

    }

}
