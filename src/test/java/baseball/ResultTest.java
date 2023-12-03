package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {
    @Test
    @DisplayName("스트라이크가 3이면 Status는 FINISH이다.")
    public void statusIfFinish() throws Exception {
        Result result = new Result(3, 0);
        assertThat(result.getStatus()).isEqualTo(Result.Status.FINISH);
    }

    @Test
    @DisplayName("스트라이크와 볼이 0이면 Status는 NOTHING이다.")
    public void statusIfNothing() throws Exception {
        Result result = new Result(0, 0);
        assertThat(result.getStatus()).isEqualTo(Result.Status.NOTHING);
    }

    @Test
    @DisplayName("FINISH와 NOTHING의 경우가 아니면 Status는 CONTINUE이다.")
    public void statusIfContinue() throws Exception {
        Result result = new Result(1, 1);
        assertThat(result.getStatus()).isEqualTo(Result.Status.CONTINUE);
    }
}