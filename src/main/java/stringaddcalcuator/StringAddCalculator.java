package stringaddcalcuator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String literal) {
        if(isLiteralNullOrEmpty(literal)){
            return 0;
        };
        String delimeterRegEx = ",|:";
        if (isCustom(literal)) {
            delimeterRegEx = findDelimeter(literal);
            literal = findLiteral(literal);
        }
        return caculate(literal,delimeterRegEx);
    }

    private static boolean isLiteralNullOrEmpty(String literal) {
        if (literal == null) {
            return true;
        }
        if (literal.isEmpty()) {
            return true;
        }
        return false;
    }

    private static boolean isCustom(String literal) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(literal);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    private static String findDelimeter(String literal) {
        String regEx = "//(.)\n(.*)";
        Matcher matcher = Pattern.compile(regEx).matcher(literal);
        return matcher.group(1);
    }

    private static String findLiteral(String literal) {
        String regEx = "//(.)\n(.*)";
        Matcher matcher = Pattern.compile(regEx).matcher(literal);
        return matcher.group(2);
    }

    private static int caculate(String literal, String delimeterRegEx) {
        String[] splintedLiteral = literal.split(delimeterRegEx);
        int sum = 0;
        for (int i = 0; i < splintedLiteral.length; i++) {
            int num = Integer.parseInt(splintedLiteral[i]);
            validateNegative(num);
            sum += num;
        }
        return sum;
    }

    private static void validateNegative(int num) {
        if (num < 0) {
            throw new RuntimeException("숫자는 양수만 가능합니다.");
        }
    }
}
