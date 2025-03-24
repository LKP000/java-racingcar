package racingcar;

public class Car {
    private String name;

    public Car(String s) {
        if(s.length() > 5) throw new IllegalArgumentException();
        name = s;
        location = 0;
    }

    public String getName() {
        return name;
    }
}
