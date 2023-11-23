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

    public CarRacingController(CarRacingService carRacingService) {
        this.carRacingService = carRacingService;
    }

    public void start() {
        carRacingService.createCarRaicingGame(InputView.readParticipants(),
                tryNumber = Integer.parseInt(InputView.readTryNumber()));
        OutputView.printStartResultMessage();
        printCarPositions();
        OutputView.printWinners(carRacingService.judgeWinners());
    }

    private void printCarPositions() {
        for (int i = 0; i < tryNumber; i++) {
            OutputView.printResult(carRacingService.moveForwardAllCars());
        }
    }


}
