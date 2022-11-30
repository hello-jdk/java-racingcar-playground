package stringaddcalcuator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String literal) {
        // 유효성
        if(literalNullOrEmpty(literal)){
            return 0;
        };
        if (checkNegative(literal)) {
            throw new RuntimeException("음수 불가");
        }

        // 매쳐
        String delimeterRegEx = ",|:";
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(literal);
        if (matcher.find()) {
            delimeterRegEx = matcher.group(1);
            literal = matcher.group(2);
        }
        String[] splintedLiteral = literal.split(delimeterRegEx);

        // 계산
        int sum = 0;
        for (int i = 0; i < splintedLiteral.length; i++) {
            sum += Integer.parseInt(splintedLiteral[i]);
        }
        return sum;
    }

    private static boolean checkNegative(String literal) {
        if (literal.contains("-")) {
            return true;
        }
        return false;
    }

    private static boolean literalNullOrEmpty(String literal) {
        if (literal == null) {
            return true;
        }
        if (literal.isEmpty()) {
            return true;
        }
        return false;
    }
}
