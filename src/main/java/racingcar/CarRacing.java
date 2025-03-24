package racingcar;

import java.util.List;
import java.util.ArrayList;

public class CarRacing {
    private List<Car> cars = new ArrayList<>();

    public CarRacing() {}

    public void addCars(String str) {
        String[] names = str.split(",");
        for (var name : names) {
            cars.add(new Car(name));
        }
    }
}
