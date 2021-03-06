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

    // one of the given test cases
    @Test
    public void shouldConvert21() {
        assertEquals("twenty one", converter.convert(21));
    }

    @Test
    public void shouldConvert22() {
        assertEquals("twenty two", converter.convert(22));
    }

    @Test
    public void shouldConvert23() {
        assertEquals("twenty three", converter.convert(23));
    }

    @Test
    public void shouldConvert29() {
        assertEquals("twenty nine", converter.convert(29));
    }

    @Test
    public void shouldConvert30() {
        assertEquals("thirty", converter.convert(30));
    }

    @Test
    public void shouldConvert31() {
        assertEquals("thirty one", converter.convert(31));
    }

    @Test
    public void shouldConvert39() {
        assertEquals("thirty nine", converter.convert(39));
    }

    @Test
    public void shouldConvert40() {
        assertEquals("forty", converter.convert(40));
    }

    @Test
    public void shouldConvert50() {
        assertEquals("fifty", converter.convert(50));
    }

    @Test
    public void shouldConvert60() {
        assertEquals("sixty", converter.convert(60));
    }

    @Test
    public void shouldConvert70() {
        assertEquals("seventy", converter.convert(70));
    }

    @Test
    public void shouldConvert80() {
        assertEquals("eighty", converter.convert(80));
    }

    @Test
    public void shouldConvert90() {
        assertEquals("ninety", converter.convert(90));
    }

    @Test
    public void shouldConvert99() {
        assertEquals("ninety nine", converter.convert(99));
    }

    @Test
    public void shouldConvert100() {
        assertEquals("one hundred", converter.convert(100));
    }

    @Test
    public void shouldConvert200() {
        assertEquals("two hundred", converter.convert(200));
    }

    @Test
    public void shouldConvert900() {
        assertEquals("nine hundred", converter.convert(900));
    }

    @Test
    public void shouldConvert101() {
        assertEquals("one hundred and one", converter.convert(101));
    }

    @Test
    public void shouldConvert199() {
        assertEquals("one hundred and ninety nine", converter.convert(199));
    }

    // one of the given test cases
    @Test
    public void shouldConvert105() {
        assertEquals("one hundred and five", converter.convert(105));
    }

    @Test
    public void shouldConvert999() {
        assertEquals("nine hundred and ninety nine", converter.convert(999));
    }

    @Test
    public void shouldConvert1000() {
        assertEquals("one thousand", converter.convert(1000));
    }

    @Test
    public void shouldConvert2000() {
        assertEquals("two thousand", converter.convert(2000));
    }

    @Test
    public void shouldConvert9000() {
        assertEquals("nine thousand", converter.convert(9000));
    }

    @Test
    public void shouldConvert1001() {
        assertEquals("one thousand and one", converter.convert(1001));
    }

    @Test
    public void shouldConvert1011() {
        assertEquals("one thousand and eleven", converter.convert(1011));
    }

    @Test
    public void shouldConvert1999() {
        assertEquals("one thousand nine hundred and ninety nine", converter.convert(1999));
    }

    @Test
    public void shouldConvert9999() {
        assertEquals("nine thousand nine hundred and ninety nine", converter.convert(9999));
    }

    @Test
    public void shouldConvert10000() {
        assertEquals("ten thousand", converter.convert(10000));
    }

    @Test
    public void shouldConvert999999() {
        assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine", converter.convert(999999));
    }

    @Test
    public void shouldConvert1000000() {
        assertEquals("one million", converter.convert(1000000));
    }

    @Test
    public void shouldConvert2000000() {
        assertEquals("two million", converter.convert(2000000));
    }

    @Test
    public void shouldConvert9000000() {
        assertEquals("nine million", converter.convert(9000000));
    }

    @Test
    public void shouldConvert999000000() {
        assertEquals("nine hundred and ninety nine million", converter.convert(999000000));
    }

    @Test
    public void shouldConvert999001000() {
        assertEquals("nine hundred and ninety nine million one thousand", converter.convert(999001000));
    }

    @Test
    public void shouldConvert999999999() {
        assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
                converter.convert(999999999));
    }

    // one of the given test cases
    @Test
    public void shouldConvert56945781() {
        assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",
                converter.convert(56945781));
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowExceptionFor0(){
        converter.convert(-1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowExceptionFor1000000000(){
        converter.convert(1000000000);
    }

}
