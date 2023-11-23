package racingcar.model;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public int moveForward(int randomNumber) {
        if (randomNumber >= 4) {
            position += 1;
        }
        return position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }


}
