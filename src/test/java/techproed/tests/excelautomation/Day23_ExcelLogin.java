package techproed.tests.excelautomation;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class Day23_ExcelLogin {

    BlueRentalLoginPage blueRentalLoginPage;
    BlueRentalHomePage blueRentalHomePage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;
    @Test
    public void login(){

        Driver.getDriver().get(ConfigReader.getProperty("blue_rental_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
//        ------SADECE ILK GIRIS-------
//        loginLink butonu sadece ilk giriste sayfada gorunur
//        Ikinci ve ucuncu girislerde sayfada gorunmeyeceginden NoSuchElementException alinir
//        Biz bu exception'i try-catch kullanarak yakalariz ve test case calismaya devam eder
        try {
            blueRentalHomePage.loginLink.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
        }catch (Exception e){

        }

//      -----------SONRAKI GIRISLER--------------
        try {
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRentalHomePage.OK.click();
            ReusableMethods.waitFor(1);// 1 saniye bekle
            blueRentalHomePage.loginLink.click();
        }catch (Exception e) {

        }

    }

    @Test
    public void customerLogin(){
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
//        ONCEKI TUM DOSYALARI ICER. RELATIVE PATH.

        String page = "customer_info";
//        DATALARI EXCEL UTILD METHODLARINI KULLANARAK BU SINIFA ALICAZ
        excelUtils = new ExcelUtils(path, page);
        excelDatalari = excelUtils.getDataList();
//        LOOP KULLANARAK DATALARI TEK TEK TEST CASEDE KULLAN
        for (Map<String, String> data : excelDatalari){
            login();//Her loopda login sayfasina gider
            //kullanici adini gir
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.email.sendKeys(data.get("username"));
            //kullanici sifresini gir
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.password.sendKeys(data.get("password"));
            //login butonuna tikla
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.loginButton.click();
        }


    }

}
/*
sam.walker@bluerentalcars.com   c!fas_art
kate.brown@bluerentalcars.com   tad1$Fas
raj.khan@bluerentalcars.com v7Hg_va^
pam.raymond@bluerentalcars.com  Nga^g6!
------ILK GIRIS---------
HOME PAGE DEYIZ
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------2. GIRIS-----
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------3. GIRIS---------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
---------4. GIRIS------------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
 */