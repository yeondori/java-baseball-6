package baseball;

public class OutputView {
    public OutputView() {
    }

    public void printResult(Result result) {
        if (result.status().equals("NOTHING")) {
            System.out.println("낫싱");
        }
        if (result.status().equals("FINISH")) {
            System.out.println("3스트라이크");
        }
        if (result.status().equals("CONTINUE")) {
            System.out.println(continueStatus(result));
        }
    }

    private String continueStatus(Result result) {
        if (result.ball > 0 && result.strike > 0) {
            return (result.ball + "볼 " + result.strike + "스트라이크");
        }
        if (result.ball > 0) {
            return (result.ball + "볼");
        }
        return (result.strike + "스트라이크");
    }
}