package techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class C19_TestNGAnnotations {

    /*
    @Test : Test case olusturmak icin kullanilir
    @Before ve @After : 5 Before 5 After annotation var
    @BeforeSuite : her bir test suite den once 1 sefer calisir
    @AfterSuite : her bir test suitinden sonra 1 sefer calisir
    @BeforeTest : her bir testden once(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @AfterTest : her bir testden sonra(TEST CASE ILE KARISTIRILMAMALI) 1 sefer calisir
    @BeforeClass : her bir classdan once 1 sefer calisir
    @AfterClass : her bir classdan sonra 1 sefer calisir
    @Before Method : her bir @Test annotationdan once tek sefer calisir. JUnitdeki karsiligi sadece @Before
    @After Method : her bir @Test annotationdan sonra tek sefer calisir. JUnitdeki karsiligi sadece @After
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Ignore : @Test caseleri atlamak(skip, ignore) icin kullanilir
    @Test(enabled = false) : @Test caseleri kullanima kapatmak icin kullanilir
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    TestNG de test case'ler isim sirasina gore calisir
    @Test(priority = 1) : Test caseler oncelemk icin kullanilir
    NOTE : default priority'nin degeri 0'a esittir

     */

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test(priority = 1)
    public void tests7(){
        System.out.println("Test 7");
    }@Test @Ignore
    public void tests2(){

        System.out.println("Test 2");
    }@Test(enabled = false)
    public void tests3(){

        System.out.println("Test 3");
    }@Test(priority = -5)
    public void tests4(){

        System.out.println("Test 4");
    }@Test(priority = 2)
    public void tests5(){

        System.out.println("Test 5");
    }@Test
    public void tests6(){

        System.out.println("Test 6");
    }

}
