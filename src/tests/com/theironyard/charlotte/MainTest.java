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

    @Test
    public void doubleChar() {
        assertEquals(Main.doubleChar(16, 17, 18), 60);
        assertEquals(Main.doubleChar(12, 13, 14), 30);
        assertEquals(Main.doubleChar(6, 4, 4), 10);
        assertEquals(Main.doubleChar(16, 2, 11), 30);
        assertEquals(Main.doubleChar(34, 35, 26), 100);
    }
    
    

}
