package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Participants;
import racingcar.service.CarRacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarRacingController {

    private CarRacingService carRacingService;
    int tryNumber;

    public void start() {
        carRacingService = new CarRacingService(new Participants(InputView.readParticipants()),
                tryNumber = Integer.parseInt(InputView.readTryNumber()));
        OutputView.printStartResultMessage();
        for (int i = 0; i < tryNumber; i++) {
            OutputView.printResult(carRacingService.moveForwardAllCars());
        }
        OutputView.printWinners(carRacingService.judgeWinners());
    }


}
