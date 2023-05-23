package vvt.exercicio;

import junit.framework.TestCase;

public class CalMethodsTest extends TestCase {
    public void testFirstOfMonth(){
        Cal c = new Cal();
        assertEquals(6, c.firstOfMonth(1, 2000));
        assertEquals(2, c.firstOfMonth(2, 2000));
        assertEquals(3, c.firstOfMonth(3, 2000));
        assertEquals(6, c.firstOfMonth(8, 1752));
        assertEquals(2, c.firstOfMonth(9, 1752));
        assertEquals(0, c.firstOfMonth(10, 1752));
        assertEquals(6, c.firstOfMonth(9, 1753));
    }


    public void testNumberOfDays(){
        Cal c = new Cal();
        assertEquals(31, c.numberOfDays(1, 2000));
        assertEquals(29, c.numberOfDays(2, 2000));
        assertEquals(31, c.numberOfDays(3, 2000));
        assertEquals(31, c.numberOfDays(8, 1752));
        assertEquals(19, c.numberOfDays(9, 1752));
        assertEquals(31, c.numberOfDays(10, 1752));
        assertEquals(30, c.numberOfDays(9, 1753));
        assertEquals(28, c.numberOfDays(2, 1753));
    }

    public void testIsLeap(){
        Cal c= new Cal();
        assertFalse(c.isLeap(1751));
        assertTrue(c.isLeap(1752));
        assertFalse(c.isLeap(1753));
        assertTrue(c.isLeap(2000));  
        assertFalse(c.isLeap(1900));
        assertTrue(c.isLeap(1904));    


    }

    public void testJan1(){
    Cal c = new Cal();
        assertEquals(4, c.jan1(1801));
        assertEquals(1, c.jan1(1753));
        assertEquals(1, c.jan1(1900));
        assertEquals(3, c.jan1(1800));
        assertEquals(2, c.jan1(1901));
        assertEquals(2, c.jan1(1799));
        assertEquals(1, c.jan1(2001));
    }

    public void testCal(){
        Cal c = new Cal();
        assertEquals("    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 ", c.cal(1, 18));
        assertEquals("       1  2 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30", c.cal(1, 19));
    }
}
