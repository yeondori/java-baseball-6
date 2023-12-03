package baseball;

import baseball.ui.InputView;
import baseball.ui.OutputView;

import java.util.List;

public class Application {
    static InputView inputView = new InputView();
    static OutputView outputView = new OutputView();


    private static final int RESTART_GAME = 1;

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        int userChoice;
        do {
            playGame();
            userChoice = inputView.requestRestartNumber();
        }
        while (userChoice == RESTART_GAME);
    }

    private static void playGame() {
        GameBuilder game = GameBuilder.build();
        Judgement judgement = new Judgement(game.getAnswer());

        while (true) {
            List<Integer> playerGuess = inputView.requestNumbers();
            Result result = judgement.judge(playerGuess);
            outputView.printResult(result);
            if (result.getStatus() == Result.Status.FINISH) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }
}
