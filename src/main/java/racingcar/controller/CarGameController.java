package racingcar.controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarGameController {

    private Game game;
    private Cars cars;


    public CarGameController() {
        this.game = new Game();
    }

    public void start() {
        List<Car> movedCars = new ArrayList<>();
        OutputView.printRequestCarNameMessage();
        String input = InputView.readCarName();
        List<String> carNameList = game.splitCarName(input);
        validateNameLength(carNameList);
        createCars(carNameList);
        OutputView.printRequestTryNumberMessage();
        int tryNumber = Integer.parseInt(InputView.readTryNumber());
        OutputView.printResultStartMessage();
        while (tryNumber-- > 0) {
            movedCars = cars.moveAll();
            OutputView.printGameResultMessage(movedCars);
        }
        OutputView.printFinalWinner(game.judgeWinner(movedCars));


    }


    public static void validateNameLength(List<String> carNameList) {
        for (int i = 0; i < carNameList.size(); i++) {
            if (carNameList.get(i).length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }


    public List<Car> createCars(List<String> carNameList) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNameList) {
            Car car = new Car(carName);
            cars.add(car);
        }
        this.cars = new Cars(cars);
        return cars;
    }



}
