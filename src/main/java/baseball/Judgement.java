package baseball;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Judgement {
    private final List<Integer> answer;

    public Judgement(List<Integer> answer) {
        this.answer = answer;
    }

    public Result judge(List<Integer> playerGuess) {
        int strikeCount = countStrikes(playerGuess);
        int ballCount = countBalls(playerGuess);

        return new Result(strikeCount, ballCount);
    }

    private int countStrikes(List<Integer> playerGuess) {
        return IntStream.range(0, playerGuess.size())
                .filter(i -> Objects.equals(playerGuess.get(i), answer.get(i)))
                .toArray()
                .length;
    }

    private int countBalls(List<Integer> playerGuess) {
        return IntStream.range(0, playerGuess.size())
                .filter(i -> !Objects.equals(playerGuess.get(i), answer.get(i))
                        && answer.contains(playerGuess.get(i)))
                .toArray()
                .length;
    }
}