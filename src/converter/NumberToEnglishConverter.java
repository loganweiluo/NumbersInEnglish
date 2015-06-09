package converter;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public String convert(int i) {
        String [] numberList = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return (numberList[i-1]);
    }
}
