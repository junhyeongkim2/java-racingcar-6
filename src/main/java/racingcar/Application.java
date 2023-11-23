package racingcar;

import racingcar.controller.CarRacingController;
import racingcar.service.CarRacingService;

public class Application {
    public static void main(String[] args) {
        CarRacingService carRacingService = new CarRacingService();
        CarRacingController carRacingController = new CarRacingController(carRacingService);
        carRacingController.start();
    }
}
