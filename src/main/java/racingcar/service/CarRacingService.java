package racingcar.service;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Participants;
import racingcar.model.Winners;
import racingcar.view.InputView;

public class CarRacingService {

    private Game game;

    public void createCarRaicingGame(String participants, int tryNumber) {
        game = new Game(participants, tryNumber);
    }

    public List<Car> moveForwardAllCars() {
        return game.moveForwardAllCars();
    }

    public Winners judgeWinners() {
        return game.judgeWinners();
    }

}
