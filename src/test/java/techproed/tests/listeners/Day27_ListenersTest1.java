package techproed.tests.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

@Listeners(techproed.utilities.Listeners.class)
public class Day27_ListenersTest1 {
    @Test
    public void test1(){
        System.out.println("PASS");
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("FAIL");
        Assert.assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("SKIP");
        throw new SkipException("Methodu Atla");
    }
    @Test
    public void test4(){
        System.out.println("EXCEPTION");
        throw new NoSuchElementException("No Such Element Exception");
    }

}