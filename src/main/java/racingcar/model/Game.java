package racingcar.model;

import java.util.List;

public class Game {
    private Cars cars;
    private int tryNumber;

    public Game(String participants, int tryNumber) {
        this.cars = new Cars(participants);
        this.tryNumber = tryNumber;
    }

    public List<Car> moveForwardAllCars() {
        return cars.moveForwardAll();
    }

    public Winners judgeWinners() {
        return new Winners(cars);
    }
}
