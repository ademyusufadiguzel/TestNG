package techproed.tests.smoketests;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day22_NegativeLoginTest {
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US100208_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("blue_rental_fake_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("blue_rental_fake_password"));
        blueRentalLoginPage.loginButton.click();
        Thread.sleep(1000);
        Assert.assertEquals(blueRentalLoginPage.error_message_1.getText(),"User with email fake@bluerentalcars.com not found");
    }
}
