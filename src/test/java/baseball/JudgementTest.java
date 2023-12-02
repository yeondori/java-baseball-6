package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JudgementTest {
    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);
    private static final List<Integer> ALL_STRIKES = Arrays.asList(1,2,3);
    private static final List<Integer> ALL_BALLS = Arrays.asList(3,1,2);
    private static final List<Integer> NOTHING = Arrays.asList(4,5,6);

    @Test
    @DisplayName("정답과 일치하면 3스트라이크이다.")
    public void judgeIfAllStrikes() throws Exception {
        //given
        Judgement judgement = new Judgement(ANSWER);
        //when
        Result result = judgement.Judge(ALL_STRIKES);
        //then
        assertThat(result.strike).isEqualTo(3);
    }

    @Test
    @DisplayName("정답과 구성은 일치하나 모든 위치가 다르면 3볼이다.")
    public void judgeIfAllBalls() throws Exception {
        //given
        Judgement judgement = new Judgement(ANSWER);
        //when
        Result result = judgement.Judge(ALL_BALLS);
        //then
        assertThat(result.ball).isEqualTo(3);
    }
}