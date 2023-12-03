package baseball;

public class Result {
    enum Status {
        FINISH("3스트라이크"), NOTHING("낫싱"), CONTINUE("");

        private String descript;

        Status(String descript) {
            this.descript = descript;
        }

        public String getDescript() {
            return descript;
        }
    }

    private Status status;
    private int strike;
    private int ball;

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
            return getContinueDiscript();
        }
        return status.getDescript();
    }

    private String getContinueDiscript() {
        if (ball > 0 && strike > 0) {
            return (ball + "볼 " + strike + "스트라이크");
        }
        if (ball > 0) {
            return (ball + "볼");
        }
        return (strike + "스트라이크");
    }
}