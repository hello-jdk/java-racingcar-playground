package view;

import java.util.Scanner;
import view.utils.Validator;

public class InputView {
    private Scanner sc;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public String[] requestCarsName() {
        String carsName = sc.next();
        Validator.checkCarsName(carsName);
        return carsName.split(",");
    }

    public int requestTryCount() {
        String tryCount = sc.next();
        Validator.checkTryCount(tryCount);
        return Integer.parseInt(tryCount);
    }
}
