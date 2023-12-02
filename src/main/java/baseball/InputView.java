package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public void requestNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        String input = readNumbers();
        validateNumbers(input);
    }

    private String readNumbers() {

    }

    private void validateNumbers(String input) {
        String[] inputs = input.split("");

        validateNumber();
        validateNumberRange();
        validateDuplicate();
    }

    private void validateNumber() {
    }

    private void validateNumberRange() {
    }

    private void validateDuplicate() {
    }
}
