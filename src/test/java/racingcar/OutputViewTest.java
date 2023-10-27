package racingcar;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.List;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.view.OutputView;

public class OutputViewTest {

    @Test
    void 경주할_자동차_이름_입력_요청_출력_테스트() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        OutputView.printRequestCarNameMessage();

        String caputredOutput = outputStream.toString();
        Assertions.assertEquals("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n", caputredOutput);

    }

    @Test
    void 시도할_회수_입력_요청_출력_테스트() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        OutputView.printRequestTryNumberMessage();

        String caputredOutput = outputStream.toString();
        Assertions.assertEquals("시도할 회수는 몇회인가요?\n", caputredOutput);

    }


    @Test
    void 결과_시작_출력_테스트() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        OutputView.printResultStartMessage();

        String caputredOutput = outputStream.toString();
        Assertions.assertEquals("\n실행 결과\n", caputredOutput);

    }

    @Test
    void 게임_실행_결과_출력_테스트() {

        LinkedHashMap<String,Integer> locations = new LinkedHashMap<>();
        locations.put("pobi",1);
        locations.put("jun",3);
        locations.put("king",0);
        locations.put("rook",2);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        OutputView.printGameResultMessage(locations);

        String capturedOutput = outputStream.toString();
        String[] outputs = capturedOutput.split("\n");
        Assertions.assertEquals(outputs[0],"pobi : -");
        Assertions.assertEquals(outputs[1],"jun : ---");
        Assertions.assertEquals(outputs[2],"king :");
        Assertions.assertEquals(outputs[3],"rook : --");
    }


}
