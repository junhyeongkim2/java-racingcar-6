package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;

public class InputView {

    private static final String NAME_PATTERN = "^(?:[a-zA-Z가-힣]+,)*[a-zA-Z가-힣]+$";
    private static final String NUMBER_PATTERN = "^[0-9]+$";


    public static String readParticipants() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        validateNameFormat(input);
        return input;
    }

    public static String readTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        validateIsInteger(input);
        return input;
    }


    public static void validateNameFormat(String input) {
        if (!Pattern.matches(NAME_PATTERN, input)) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값이 입력되었습니다.");
        }
    }

    public static void validateIsInteger(String input) {
        if (!Pattern.matches(NUMBER_PATTERN, input)) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값이 입력되었습니다.");
        }
    }


}
