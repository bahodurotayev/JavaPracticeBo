package Day44.Bahodur.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Check {
    @Test
    public void testTotal(){
        int num = 15;
     //   int expected = JavaMath.getTotal(5);
        Assert.assertEquals(num, JavaMath.getTotal(5));
    }
    @Test
    public void testTotalIsTrue(){
        int num = 15;
        //   int expected = JavaMath.getTotal(5);
        Assert.assertTrue(num == JavaMath.getTotal(5), "Boolean");
    }
    @Test
    public void firstLetter(){

        ArrayList<String> list= new ArrayList<>(Arrays.asList("ali", "vali"));

        String firstLetter = JavaMath.firstLetter(list, "");

        Assert.assertNotNull(firstLetter);
    }
    @Test
    public void notEmpty(){

        ArrayList<String> list= new ArrayList<>(Arrays.asList("ali", "vali"));

        String firstLetter = JavaMath.firstLetter(list, "a");
        System.out.println(firstLetter);

        Assert.assertNotNull(firstLetter);
    }
}
