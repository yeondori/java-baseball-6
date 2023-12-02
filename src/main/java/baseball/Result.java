package baseball;

public class Result {
    public int strike;
    public int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public long getStrike() {
        return strike;
    }

    public long getBall() {
        return ball;
    }
}