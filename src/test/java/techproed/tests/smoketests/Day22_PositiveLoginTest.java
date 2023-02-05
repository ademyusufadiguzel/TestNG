package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.Reporter;
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

        Reporter.log("Sayfaya git");

        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        Reporter.log("Login Buttonuna tikla");
        blueRentalHomePage.loginLink.click();
        Reporter.log("Giris bilgilerini gir");
        blueRentalLoginPage.email.sendKeys(ConfigReader.getProperty("blue_rental_email"));
        blueRentalLoginPage.password.sendKeys(ConfigReader.getProperty("blue_rental_password"));
        blueRentalLoginPage.loginButton.click();
        Reporter.log("Giris yapildigini dogrula");

        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());
        Reporter.log("Driver kapat");
        Driver.closeDriver();


    }



}
