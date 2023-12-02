package baseball;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Judgement {
    private final List<Integer> answer;

    public Judgement(List<Integer> answer) {
        this.answer = answer;
    }

    public Result Judge(List<Integer> player) {
        int strikeCount = countStrikes(player);
        int ballCount = countBalls(player);

        return new Result(strikeCount, ballCount);
    }

    private int countStrikes(List<Integer> player) {
        return IntStream.range(0, player.size())
                .filter(i -> Objects.equals(player.get(i), answer.get(i)))
                .toArray()
                .length;
    }

    private int countBalls(List<Integer> player) {
        return IntStream.range(0, player.size())
                .filter(i -> !Objects.equals(player.get(i), answer.get(i)) && answer.contains(player.get(i)))
                .toArray()
                .length;
    }
}