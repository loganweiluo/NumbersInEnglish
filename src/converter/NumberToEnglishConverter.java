package converter;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public String convert(int i) {
        String[] numbersInEnglish = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (i <= 20) {
            return (numbersInEnglish[i]);
        }
        if (i == 21) {
            return "twenty one";
        }
        if (i == 22) {
            return "twenty two";
        }
        return null;
    }
}
