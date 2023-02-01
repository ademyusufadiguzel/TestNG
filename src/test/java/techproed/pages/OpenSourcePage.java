package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class OpenSourcePage {

//    Page objelerini bu sinifda buluruz.

    public OpenSourcePage(){
//        PageFactory seleniumdan gelen ve bu sayfadaki elementeleri baslangic degeri vermek icin kullanilir.
//        Bu sekilde sayfa objeleri cagirdiginda null pointer exception alinmaz.
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    PAGE OBJELERINI OLUSTUR
//    public WebElement username = Driver.getDriver.findElement(By.name("username"));

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;



}
