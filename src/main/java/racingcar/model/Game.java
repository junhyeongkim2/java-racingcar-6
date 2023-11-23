package racingcar.model;

import java.util.List;

public class Game {
    private Cars cars;
    private int tryNumber;

    public Game(Cars cars, int tryNumber) {
        this.cars = cars;
        this.tryNumber = tryNumber;
    }

    public List<Car> moveForwardAllCars() {
        return cars.moveForwardAll();
    }


}
