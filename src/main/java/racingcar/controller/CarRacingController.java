package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Participants;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarRacingController {

    public void start() {
        Participants participants = new Participants(InputView.readParticipants());
        int tryNumber = Integer.parseInt(InputView.readTryNumber());
        Game game = new Game(new Cars(participants), tryNumber);
        OutputView.printStartResultMessage();
        for (int i = 0; i < tryNumber; i++) {
            OutputView.printResult(game.moveForwardAllCars());
        }

        OutputView.printWinners(game.judgeWinners());
    }


}
