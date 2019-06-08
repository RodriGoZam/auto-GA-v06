package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.Nasa.Imagery;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class LoadPageNasa {
    public static Imagery LoadGoogleNasaImagery() {
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Imagery();
    }

    public static void main(String[] args) throws InterruptedException {
        LoadGoogleNasaImagery().GetURL();
    }
}
