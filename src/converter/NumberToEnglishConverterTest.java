package converter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverterTest {
    NumberToEnglishConverter converter = new NumberToEnglishConverter();

    @Test
    public void shouldConvert0() {
        assertEquals("zero", converter.convert(0));
    }

    @Test
    public void shouldConvert1() {
        assertEquals("one", converter.convert(1));
    }

    @Test
    public void shouldConvert2() {
        assertEquals("two", converter.convert(2));
    }

    @Test
    public void shouldConvert3() {
        assertEquals("three", converter.convert(3));
    }

    @Test
    public void shouldConvert4() {
        assertEquals("four", converter.convert(4));
    }

    @Test
    public void shouldConvert5() {
        assertEquals("five", converter.convert(5));
    }

    @Test
    public void shouldConvert6() {
        assertEquals("six", converter.convert(6));
    }

    @Test
    public void shouldConvert7() {
        assertEquals("seven", converter.convert(7));
    }

    @Test
    public void shouldConvert8() {
        assertEquals("eight", converter.convert(8));
    }

    @Test
    public void shouldConvert9() {
        assertEquals("nine", converter.convert(9));
    }

    @Test
    public void shouldConvert10() {
        assertEquals("ten", converter.convert(10));
    }

    @Test
    public void shouldConvert11() {
        assertEquals("eleven", converter.convert(11));
    }

    @Test
    public void shouldConvert12() {
        assertEquals("twelve", converter.convert(12));
    }

    @Test
    public void shouldConvert13() {
        assertEquals("thirteen", converter.convert(13));
    }

    @Test
    public void shouldConvert14() {
        assertEquals("fourteen", converter.convert(14));
    }

    @Test
    public void shouldConvert15() {
        assertEquals("fifteen", converter.convert(15));
    }

    @Test
    public void shouldConvert16() {
        assertEquals("sixteen", converter.convert(16));
    }

    @Test
    public void shouldConvert17() {
        assertEquals("seventeen", converter.convert(17));
    }

    @Test
    public void shouldConvert18() {
        assertEquals("eighteen", converter.convert(18));
    }

    @Test
    public void shouldConvert19() {
        assertEquals("nineteen", converter.convert(19));
    }

    @Test
    public void shouldConvert20() {
        assertEquals("twenty", converter.convert(20));
    }
}
