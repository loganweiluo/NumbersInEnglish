package converter;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public static final String[] NUMBERS_IN_ENGLISH_0_TO_19 = {"one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    public static final String[] NUMBERS_IN_ENGLISH_IN_TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};

    public String convert(int i) {
        if (i == 0) {
            return "zero";
        }

        StringBuilder result = new StringBuilder();
        if (i >= 1000000) {
            int millions = i / 1000000;
            result.append(convert(millions));
            result.append(" million");
            int remain = i % 1000000;
            if (remain > 0) {
                result.append(" ");
                result.append(convert(remain));
            }
            return result.toString();
        }

        if (i >= 1000) {
            int thousands = i / 1000;
            result.append(convert(thousands));
            result.append(" thousand");
            int remain = i % 1000;
            if (remain > 0) {
                if (remain < 100) {
                    result.append(" and");
                }
                result.append(" ");
                result.append(convert(remain));
            }
            return result.toString();
        }

        if (i >= 100) {
            int remain = i % 100;
            int hundreds = i / 100;
            result.append(convert(hundreds));
            result.append(" hundred");
            if (remain > 0) {
                result.append(" and ");
                result.append(convert(remain));
            }
            return result.toString();
        }

        if (i < 20) {
            return (NUMBERS_IN_ENGLISH_0_TO_19[i - 1]);
        }

        int tens = i / 10;
        result.append(NUMBERS_IN_ENGLISH_IN_TENS[tens - 2]);
        int singles = i % 10;
        if (singles > 0) {
            result.append(" ");
            result.append(convert(singles));
        }
        return result.toString();
    }
}
