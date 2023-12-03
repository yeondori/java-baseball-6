package baseball;

public class OutputView {
    public void printResult(Result result) {
        if (result.status().equals("NOTHING")) {
            System.out.println("낫싱");
        }
        if (result.status().equals("FINISH")) {
            System.out.println("3스트라이크");
        }
        if (result.status().equals("CONTINUE")) {
            printContinue(result);
        }
    }

    private void printContinue(Result result) {
        if (result.ball > 0) {
            System.out.print(result.ball + "볼 ");
        }
        if (result.strike > 0) {
            System.out.print(result.strike + "스트라이크\n");
        }
    }
}