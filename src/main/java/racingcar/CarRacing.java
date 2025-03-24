package racingcar;

import java.util.List;
import java.util.ArrayList;

public class CarRacing {
    private List<Car> cars = new ArrayList<>();
    private int round;

    public CarRacing() {}

    public void addCars(String str) {
        String[] names = str.split(",");
        for (var name : names) {
            cars.add(new Car(name));
        }
    }

    public void setRound(int r) {
        round = r;
    }
}
