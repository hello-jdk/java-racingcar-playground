package DB;

public class CarDTO {
    private final String carName;
    private int distanse;

    public CarDTO(String carName) {
        this.carName = carName;
        this.distanse = 0;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistanse() {
        return distanse;
    }
}
