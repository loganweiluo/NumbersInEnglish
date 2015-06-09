package converter;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public String convert(int i) {
        String[] numbersInEnglish = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        StringBuilder result = new StringBuilder();
        if (i <= 20) {
            return (numbersInEnglish[i]);
        }
        if (i >= 30) {
            result.append("thirty");
            int remain = i % 30;
            if (remain != 0) {
                result.append(" ");
                result.append(convert(remain));
            }
            return result.toString();
        } else {
            int remain = i % 20;
            result.append(convert(20));
            result.append(" ");
            result.append(convert(remain));
        }
        return result.toString();
    }
}
