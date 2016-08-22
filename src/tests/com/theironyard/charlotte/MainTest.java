package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jenniferchang on 8/21/16.
 */
public class MainTest {

//    @Test
//    public void blackJackWinner() {
//        assertEquals(Main.blackJack(21, 19), 21);
//        assertEquals(Main.blackJack(21, 21), 21);
//        assertEquals(Main.blackJack(10, 5), 10);
//        assertEquals(Main.blackJack(22, 22), 0);
//    }

//    @Test
//    public void makeChocolateNeeded() {
//        assertEquals(Main.makeChocolate(4, 1, 9), 4);
//        assertEquals(Main.makeChocolate(4, 1, 10), -1);
//        assertEquals(Main.makeChocolate(4, 1, 7), 2);
//
//    }
//
//    @Test
//    public void luckySum() {
//        assertEquals(Main.luckySum(13, 1, 9), 0);
//        assertEquals(Main.luckySum(11, 13, 10), 11);
//        assertEquals(Main.luckySum(13, 13, 13), 0);
//        assertEquals(Main.luckySum(13, 13, 5), 0);
//        assertEquals(Main.luckySum(1, 1, 13), 2);
//
//    }


//    @Test
//    public void evenlySpaced() {
//        assertTrue(Main.evenlySpaced(4, 6, 8));
//        assertTrue(Main.evenlySpaced(2, 4, 6));
//        assertTrue(Main.evenlySpaced(10, 20, 30));
//        assertTrue(Main.evenlySpaced(-1, 0, 1));
//        assertFalse(Main.evenlySpaced(2, 10, 12));
//    }


//    @Test
//    public void roundSum() {
//        assertEquals(Main.roundSum(16, 17, 18), 60);
//        assertEquals(Main.roundSum(12, 13, 14), 30);
//        assertEquals(Main.roundSum(6, 4, 4), 10);
//        assertEquals(Main.roundSum(16, 2, 11), 30);
//        assertEquals(Main.roundSum(34, 35, 26), 100);
//    }
//
//    @Test
//    public void doubleChar() {
//        assertEquals(Main.doubleChar("The"),"TThhee");
//        assertEquals(Main.doubleChar("Hi-There"),"HHii--TThheerree");
//        assertEquals(Main.doubleChar("AAbb"),"AAAAbbbb");
//        assertEquals(Main.doubleChar("CAt"),"CCAAtt");
//        assertEquals(Main.doubleChar("axaxax"),"aaxxaaxxaaxx");
//    }


//    @Test
//    public void countCode() {
//        assertEquals(Main.countCode("abcodeeioajsfd"), 1);
//        assertEquals(Main.countCode("adsfadfdf"), 0);
//        assertEquals(Main.countCode("adfadfcodelkacope"), 2);
//        assertEquals(Main.countCode("codecopecodecobe"),4);
//    }
//
//    @Test
//    public void bobThere() {
//        assertTrue(Main.bobThere("jadslfjboblkjasdf"));
//        assertFalse(Main.bobThere("adsfadsfdasf"));
//        assertTrue(Main.bobThere("kjadfbab"));
//        assertTrue(Main.bobThere("asdfdddddbub"));
//        assertFalse(Main.bobThere("adflkjbac"));
//    }


//
//    @Test
//    public void repeatEnd() {
//        assertEquals(Main.repeatEnd("Hello", 3), "llollollo");
//        assertEquals(Main.repeatEnd("Hello", 2), "lolo");
//        assertEquals(Main.repeatEnd("Hello", 1), "o");
//        assertEquals(Main.repeatEnd("Jenni", 5), "JenniJenniJenniJenniJenni");
//
//    }



//    @Test
//    public void prefixAgain() {
//        assertTrue(Main.prefixAgain("abXYabc", 1));
//        assertTrue(Main.prefixAgain("abXYabc", 2));
//        assertFalse(Main.prefixAgain("abXYabc", 3));
//        assertTrue(Main.prefixAgain("jennilalalalaidfjfkjdfjenni", 5));
//  }

//    @Test
//    public void sameStarChar() {
//        assertTrue(Main.sameStarChar("xy*yzz"));
//        assertFalse(Main.sameStarChar("xy*zzz"));
//        assertTrue(Main.sameStarChar("*xa*az"));
//    }

//    @Test
//    public void countHi() {
//        assertEquals(Main.countHi("abc hi ho"), 1);
//        assertEquals(Main.countHi("ABChi hi"), 2);
//        assertEquals(Main.countHi("hihi"), 2);
//    }

//    @Test
//    public void endOther() {
//        assertTrue(Main.endOther("Hiabc", "abc"));
//        assertTrue(Main.endOther("AbC", "HiaBc"));
//        assertTrue(Main.endOther("abc", "abXabc"));
//        assertFalse(Main.endOther("abc", "abXabd"));
//    }

//    @Test
//    public void countEvens() {
//        assertEquals(Main.countEvens(new int[]{2, 3, 4, 5, 6}), 3);
//        assertEquals(Main.countEvens(new int[]{1, 3, 9, 5, 23}), 0);
//        assertEquals(Main.countEvens(new int[]{2, 8, 4, 10, 6, 100}), 6);
//        assertEquals(Main.countEvens(new int[]{1, 333, 93333333, -2, 202}), 2);
//    }


//    @Test
//    public void sum13() {
//        assertEquals(Main.sum13(new int[]{100, 2, 10, 5}), 117);
//        assertEquals(Main.sum13(new int[]{13, 13, 13, 13}), 0);
//        assertEquals(Main.sum13(new int[]{4, 20, 50, 13, 100, 5}), 79);
//        assertEquals(Main.sum13(new int[]{-1, 13, 10, 100, 2000, 13}), 2099);
//    }

    @Test
    public void lucky13() {
        assertTrue(Main.lucky13(new int[]{4, 45, 7, 9, 0}));
        assertFalse(Main.lucky13(new int[]{1, 45, 7, 9, 0}));
        assertFalse(Main.lucky13(new int[]{100, 45, 7, 9, 3, -5}));
        assertFalse(Main.lucky13(new int[]{100, 45, 7, 9, 563, -3}));
    }


}
