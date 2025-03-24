package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int location;

    public Car(String s) {
        if(s.length() > 5) throw new IllegalArgumentException();
        name = s;
        location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        int r = Randoms.pickNumberInRange(0,9);
        if (r >= 4) ++location;
    }
}
