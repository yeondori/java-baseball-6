package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {
    private final List<Integer> answer;

    private GameBuilder(List<Integer> answer) {
        this.answer = answer;
    }

    public GameBuilder build() {
        List<Integer> answer = createNumbers();
        return new GameBuilder(answer);
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

    public List<Integer> getAnswer() {
        return answer;
    }
}