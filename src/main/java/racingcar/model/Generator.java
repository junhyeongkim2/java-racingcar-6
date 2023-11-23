package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Generator {

    private final static int START_NUMBER = 0;
    private final static int END_NUMBER = 9;

    public static int generateRandomNumber() {
        return Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
    }
}
