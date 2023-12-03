package baseball;

import static baseball.Result.*;

public class OutputView {
    public OutputView() {
    }

    public void printResult(Result result) {
        System.out.println(result.getStatusDescript());
    }
}