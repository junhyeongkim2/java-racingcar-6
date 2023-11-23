package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {

    public static void printStartResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printResult(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + " : ");
            for (int j = 0; j < cars.get(i).getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
