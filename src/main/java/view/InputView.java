package view;

import java.util.Scanner;

public class InputView {
    private Scanner sc;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public String[] requestCarsName() {
        String carsName = sc.next();

        return carsName.split(",");
    }

    public int requestTryCount() {
        String tryCount = sc.next();
        return Integer.parseInt(tryCount);
    }
}
