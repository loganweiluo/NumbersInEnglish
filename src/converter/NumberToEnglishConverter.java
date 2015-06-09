package converter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by weiluo on 09/06/15.
 */
public class NumberToEnglishConverter {
    public static final String[] NUMBERS_IN_ENGLISH_0_TO_19 = {"zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    public static final String[] NUMBERS_IN_ENGLISH_IN_TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};
    public static final int ONE_MILLION = 1000000;
    public static final int ONE_THOUSAND = 1000;
    public static final int ONE_HUNDRED = 100;

    public static Map<Integer, String> unitToEnglish = new LinkedHashMap<>();

    static {
        unitToEnglish.put(ONE_MILLION, " million");
        unitToEnglish.put(ONE_THOUSAND, " thousand");
        unitToEnglish.put(ONE_HUNDRED, " hundred");
    }

    public String convert(int input) {
        if (input < 0 || input > 999999999) {
            throw new IllegalArgumentException("Number out of bound");
        }

        if (input < 20) {
            return (NUMBERS_IN_ENGLISH_0_TO_19[input]);
        }

        if (input < 100) {
            return convertUpTo99(input);
        }

        for (int unit : unitToEnglish.keySet()) {
            if (input >= unit) {
                return convertNumberInUnit(input, unit);
            }
        }

        //should not be reached
        return "";
    }

    private String convertUpTo99(int input) {
        StringBuilder result = new StringBuilder();
        int tens = input / 10;
        result.append(NUMBERS_IN_ENGLISH_IN_TENS[tens - 2]);
        int singles = input % 10;
        if (singles > 0) {
            result.append(" ");
            result.append(convert(singles));
        }
        return result.toString();
    }

    private String convertNumberInUnit(int input, int unit) {
        StringBuilder result = new StringBuilder();
        int numbersOfUnits = input / unit;
        result.append(convert(numbersOfUnits));
        result.append(unitToEnglish.get(unit));

        int remainder = input % unit;
        if (remainder > 0) {
            // for cases like 1001 or 123, there needs to be an "and" to conform to English conventions
            if ((unit == ONE_THOUSAND && remainder < ONE_HUNDRED) || (unit == ONE_HUNDRED)) {
                result.append(" and");
            }
            result.append(" ");
            result.append(convert(remainder));
        }
        return result.toString();
    }
}
