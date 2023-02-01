package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {

    OpenSourcePage openSourcePage;

    @Test
    public void openSourceLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));
        Thread.sleep(5000);
        openSourcePage = new OpenSourcePage();

        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.loginButton.click();
        Thread.sleep(1000);

    }

}
