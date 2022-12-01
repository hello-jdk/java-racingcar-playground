package racing.utils;

public class Validator {
    public static void checkCarName(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("1자 이상 5자 이하의 이름을 입력해주세요.");
        }
    }

    public static void checkRacingGameNameSize(String[] names) {
        if (names.length < 2) {
            throw new IllegalArgumentException("자동차는 최소 2대 이상이여야합니다.");
        }
    }
}
