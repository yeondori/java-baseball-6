package baseball;

import java.util.List;

public class Application {
    static InputView inputView = new InputView();
    static OutputView outputView = new OutputView();

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        int restart;
        do {
            playGame();
            restart = inputView.requestRestartNumber();
        }
        while (restart == 1);
    }

    private static void playGame() {
        GameBuilder game = GameBuilder.build();
        Judgement judgement = new Judgement(game.getAnswer());

        while (true) {
            List<Integer> player = inputView.requestNumbers();
            Result result = judgement.judge(player);
            outputView.printResult(result);
            if (result.status().equals("FINISH")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }
}
