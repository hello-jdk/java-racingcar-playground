package DB;

public class CarDTO {
    private final String carName;
    private int distanse;

    public CarDTO(String carName, int distanse) {
        this.carName = carName;
        this.distanse = distanse;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistanse() {
        return distanse;
    }
}
