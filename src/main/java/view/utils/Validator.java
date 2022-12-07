package view.utils;

public class Validator {
    public static void checkCarsName(String carsName) {
        String[] carsNameList = carsName.split(",");
        if (carsNameList.length == 1) {
            throw new IllegalArgumentException("혼자서는 경주를 할 수 없습니다.");
        }
    }

    public static void checkTryCount(String tryCount) {
        checkNumber(tryCount);
        int tryCountNumber = Integer.parseInt(tryCount);
        if (tryCountNumber == 0) {
            throw new IllegalArgumentException("시도할 횟수는 1회 이상입니다.");
        }
    }

    private static void checkNumber(String tryCount) {
        String numberRegularExpression = "^[0-9]+$";
        boolean isNotNumber = !(tryCount.matches(numberRegularExpression));
        if (isNotNumber) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
    }
}
