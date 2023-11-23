package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.model.Winners;

public class OutputView {

    public static void printStartResultMessage() {
        System.out.println("\n실행 결과");
    }

    public static void printResult(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getName() + " : ");
            for (int j = 0; j < cars.get(i).getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinners(Winners judgeWinners) {
        System.out.print("최종 우승자 : ");
        System.out.print(judgeWinners.getWinners().stream().collect(Collectors.joining(", ")).toString());
    }
}
