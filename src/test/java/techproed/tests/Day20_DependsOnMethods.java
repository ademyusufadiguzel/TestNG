package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_DependsOnMethods {

    @Test
    public void homeTest(){
        System.out.println("Home Test");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "homeTest")
    public void searchTest(){
        System.out.println("Search Test");
    }
    @Test(dependsOnMethods = "homeTest")
    public void paymentTest(){
        System.out.println("Payment Test");
    }

}

/*
TestNG de tum @Test methodlari birbirlerinden bagimsiz olarak calisirlar
Eger methodlari bagimli hale getirmek istersem dependsOnMethods parametresi kullanilir
Buradaki ornekte searchTest methodunu homeTest methoduna bagimlidir
searchTest'den once homeTest calisir.
Eger homeTest basarili ise searchTest calisir.
Eger homeTest basarisiz ise searchTest ignore edilir.
 */