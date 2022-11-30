package stringaddcalcuator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String literal) {
        // 유효성
        if(isLiteralNullOrEmpty(literal)){
            return 0;
        };

        // 매쳐
        String delimeterRegEx = ",|:";
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(literal);
        if (matcher.find()) {
            delimeterRegEx = matcher.group(1);
            literal = matcher.group(2);
        }
        String[] splintedLiteral = literal.split(delimeterRegEx);

        return caculate(splintedLiteral);
    }

    private static int caculate(String[] splintedLiteral) {
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

    private static boolean checkNegative(String literal) {
        if (literal.contains("-")) {
            return true;
        }
        return false;
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
}
