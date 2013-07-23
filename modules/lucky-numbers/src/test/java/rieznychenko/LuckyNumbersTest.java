package rieznychenko;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LuckyNumbersTest {

    @Test
    public void testLucky() {
        assertTrue(LuckyNumbers.isLucky(305008));
        assertTrue(LuckyNumbers.isLucky(825609));
        assertTrue(LuckyNumbers.isLucky(905734));
        assertFalse(LuckyNumbers.isLucky(905108));
        assertFalse(LuckyNumbers.isLucky(815078));
        assertFalse(LuckyNumbers.isLucky(105008));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLuckyNegative() {
        LuckyNumbers.isLucky(-1);
    }

    @Test
    public void testRange() {
        assertTrue(LuckyNumbers.checkRange(123456, 123789));
    }

    @Test
    public void testRangeInvalid() {
        assertFalse(LuckyNumbers.checkRange(100, 0));
    }
}
