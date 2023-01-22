package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day20_Driver_Config_Test {


    @Test
    public void firstTest() {
        //amazon'a git
        //driver -> Driver.getDriver()
        //ConfigReader,getProperty("amaonz_url) -> https://www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        //title'in amaozn icerdigini test et
        String pageTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("Amazon"));

        //Close Driver
        Driver.closeDriver();
    }

}
