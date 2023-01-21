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

    @Test
    public void tests1(){

        System.out.println("Test 1");
    }@Test
    public void tests2(){

        System.out.println("Test 2");
    }@Test
    public void tests3(){

        System.out.println("Test 3");
    }@Test
    public void tests4(){

        System.out.println("Test 4");
    }@Test
    public void tests5(){

        System.out.println("Test 5");
    }@Test
    public void tests6(){

        System.out.println("Test 6");
    }

}
