package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }


    public int createRandomNumber() {
        int carNumber = Randoms.pickNumberInRange(0, 9);
        return carNumber;
    }


}
