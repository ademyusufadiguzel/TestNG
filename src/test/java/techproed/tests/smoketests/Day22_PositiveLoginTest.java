package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_PositiveLoginTest {

    //  •Name: US100201_Admin_Login
    //	•Description:
    //	•Admin bilgileriyle giriş
    //	•Acceptance Criteria:
    //	•Admin olarak, uygulamaya giriş yapabilmeliyim
    //	•https://www.bluerentalcars.com/
    //	•Admin email: jack@gmail.com
    //	•Admin password: 12345

    BlueRentalLoginPage blueRentalLoginPage ;
    BlueRentalHomePage blueRentalHomePage ;

    @Test
    public void US100201_Admin_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("blue_rental_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("blue_rental_password"));
        blueRentalLoginPage.loginButton.click();

        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());


    }



}
