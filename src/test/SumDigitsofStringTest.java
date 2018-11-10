package test;

import static org.junit.Assert.assertEquals;

import main.SumDigitsofString;
import org.junit.Test;

/**
 * Created by peiqiutian on 10/11/2018.
 */
public class SumDigitsofStringTest {

    @Test
    public void testGetSumDigitsFunction() {
        String s = "abc123";
        assertEquals(6, SumDigitsofString.getSumDigits(s, false));
        assertEquals(39, SumDigitsofString.getSumDigits(s, true));

        String t = "ABCFG123";
        assertEquals(6, SumDigitsofString.getSumDigits(t, false));
        assertEquals(54, SumDigitsofString.getSumDigits(t, true));
    }
}
