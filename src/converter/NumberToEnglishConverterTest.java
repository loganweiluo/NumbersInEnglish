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
    public void shouldConvert10() {
        assertEquals("ten", converter.convert(10));
    }
}
