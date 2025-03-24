package racingcar;

import java.util.List;
import java.util.ArrayList;

public class CarRacing {
    private List<Car> cars = new ArrayList<>();
    private List<String> winners = new ArrayList<>();
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

    public void moveCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public void referee() {
        cars.sort((Car o1, Car o2) -> o2.getLocation() - o1.getLocation());
        int max = cars.get(0).getLocation();
        for (Car car : cars) {
            if (car.getLocation() >= max) winners.add(car.getName());
            else break;
        }
    }
}
