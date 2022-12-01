package racing.utils;

public class Validator {
    public static void checkCarName(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("1자 이상 5자 이하의 이름을 입력해주세요.");
        }
    }
}
