package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class GameManager {
    private final List<Integer> answer;

    public GameManager(List<Integer> answer) {
        this.answer = createNumbers();
    }

    private List<Integer> createNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }

    public static class Result {
        public long strike;
        public long ball;

        public Result(long strike, long ball) {
            this.strike = strike;
            this.ball = ball;
        }
    }
}