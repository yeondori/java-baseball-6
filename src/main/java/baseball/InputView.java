package baseball;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public InputView() {
    }

    public List<Integer> requestNumbers() {
        System.out.print("숫자를 입력해주세요 : ");

        while (true) {
            try {
                return readNumbers();
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    public int requestRestartNumber() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        while (true) {
            try {
                return readRestartNumber();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int readRestartNumber() {
        String input = readLine();
        validateRestartNumber(input);
        return Integer.parseInt(input);
    }

    private static void validateRestartNumber(String input) {
        if (!input.matches("^[1-2]$")) {
            throw new IllegalArgumentException("[ERROR] 1 또는 2만 입력 가능합니다.");
        }
    }

    private List<Integer> readNumbers() {
        String input = readLine();
        validateNumbers(input);
        return parseNumbers(input);
    }

    private List<Integer> parseNumbers(String input) {
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .toList();
    }

    private void validateNumbers(String input) {
        validateNumber(input);
        validateDuplicate(input);
    }

    private void validateNumber(String input) {
        if (!input.matches("^[1-9]+$")) {
            throw new IllegalArgumentException("[ERROR] 1~9 사이의 숫자 3개만 입력 가능합니다.\n다시 입력해주세요 :");
        }
    }

    private void validateDuplicate(String input) {
        if (Arrays.stream(input.split("")).distinct().count() != 3) {
            throw new IllegalArgumentException("[ERROR] 중복이 없는 3개의 수만 입력 가능합니다.\n다시 입력해주세요 :");
        }
    }
}