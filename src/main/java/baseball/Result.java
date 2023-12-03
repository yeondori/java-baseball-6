package baseball;

public class Result {
    public int strike;
    public int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public String status() {
        if (strike == 3) {
            return "FINISH";
        }
        if (strike + ball == 0) {
            return "NOTHING";
        }
        return "CONTINUE";
    }
}