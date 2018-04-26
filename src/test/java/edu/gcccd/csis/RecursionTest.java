package edu.gcccd.csis;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void printEveryOther() {
        //default test
        String s2 =Recursion.printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
        String s10 =Recursion.printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10);
        assertEquals("k can not be greater than the length of the array", s10);
        String s11 =Recursion.printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 11);
        assertEquals("k can not be greater than the length of the array", s11);
    }

    @Test
    public void printStars() {
        String s1 =Recursion.printStars("hellloo");
        assertEquals("hel*l*lo*o", s1);
       //test string null
        String s2 =Recursion.printStars("");
        assertEquals("", s2);
        //test string same
        String s3 =Recursion.printStars("aaaaaaaa");
        assertEquals("a*a*a*a*a*a*a*a", s3);
        //test string equal to *
        String s4 =Recursion.printStars("********");
        assertEquals("***************", s4);
    }

    /*
     * we know the sum of the 1st k positive numbers is n(n+1)2
     */
    @Test
    public void sum() {
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(100);
            assertEquals(k * (k + 1) / 2, Recursion.sum(k));
        }
        // corner cases
        assertEquals(0, Recursion.sum(-1));
        assertEquals(0, Recursion.sum(0));
        try {
            int x = Recursion.sum(Integer.MAX_VALUE); // stackoverflow
            fail();
        } catch (StackOverflowError error) {
            assertTrue(true);
        }
    }
}