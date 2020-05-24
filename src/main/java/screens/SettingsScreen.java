package screens;

import general.AppiumElement;
import general.ScreenManager;
import io.appium.java_client.AppiumDriver;

import static general.Logger.info;

public class SettingsScreen extends BaseScreen
{
    public SettingsScreen(AppiumDriver driver)
    {
        super(driver);
        addElement("settings", "xpath", "//*[@text='Settings']");
        addElement("countryOrRegion", "xpath", "//*[@text='Country or region']");
        addElement("switchWidget", "id", "switchWidget");
        addElement("unitedStates", "xpath", "//*[@text='United States']");
        addElement("filter", "id", "filter");
        addElement("swaziland", "xpath", "//*[@text='Swaziland']");
        addElement("sweden", "xpath", "//*[@text='Sweden']");
        addElement("switzerland", "xpath", "//*[@text='Switzerland']");
    }
    @Override
    public AppiumElement getMainElement(){
        return getElement("settings");
    }
    @Override
    public void searchFor(String string){
        info("Searching for '" + string + "'");
        getElement("filter").find(getTimeout()).sendKeys(string);
    }
}
