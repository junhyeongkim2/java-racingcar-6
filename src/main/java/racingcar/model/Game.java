package racingcar.model;

import java.util.List;

public class Game {
    private Cars cars;

    public Game(String participants) {
        this.cars = new Cars(participants);
    }

    public List<Car> moveForwardAllCars() {
        return cars.moveForwardAll();
    }

    public Winners judgeWinners() {
        return new Winners(cars);
    }
}
