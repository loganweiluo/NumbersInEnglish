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
    public void shouldConvertOne() {
        assertEquals("one", converter.convert(1));
    }

    @Test
    public void shouldConvertTwo() {
        assertEquals("two", converter.convert(2));
    }

    @Test
    public void shouldConvertThree() {
        assertEquals("three", converter.convert(3));
    }
}
