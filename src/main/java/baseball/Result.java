package baseball;

public class Result {
    public enum Status {
        FINISH("3스트라이크"), NOTHING("낫싱"), CONTINUE("");

        private final String descript;

        Status(String descript) {
            this.descript = descript;
        }

        public String getDescript() {
            return descript;
        }
    }

    private final Status status;
    private final int strike;
    private final int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
        this.status = calculateStatus();
    }

    private Status calculateStatus() {
        if (strike == 3) {
            return Status.FINISH;
        }
        if (strike + ball == 0) {
            return Status.NOTHING;
        }
        return Status.CONTINUE;
    }

    public Status getStatus() {
        return status;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public String getStatusDescript() {
        if (this.status == Status.CONTINUE) {
            return getContinueDescript();
        }
        return status.getDescript();
    }

    private String getContinueDescript() {
        if (ball > 0 && strike > 0) {
            return (ball + "볼 " + strike + "스트라이크");
        }
        if (ball > 0) {
            return (ball + "볼");
        }
        return (strike + "스트라이크");
    }
}