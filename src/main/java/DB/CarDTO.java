package DB;

public class CarDTO {
    private final String carName;
    private int distance;

    public CarDTO(String carName, int distance) {
        this.carName = carName;
        this.distance = distance;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistance() {
        return distance;
    }
}
