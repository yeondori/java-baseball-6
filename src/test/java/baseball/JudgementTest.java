package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgementTest {
    private static final List<Integer> ANSWER = Arrays.asList(1,2,3);
    private static final List<Integer> PLAYER1 = Arrays.asList(1,2,3);
    private static final List<Integer> PLAYER2 = Arrays.asList(3,1,2);
    private static final List<Integer> PLAYER3 = Arrays.asList(4,5,6);

    @Test
    @DisplayName("정답과 일치하면 3스트라이크이다.")
    public void judgeIfAllStrikes() throws Exception {
        //given
        Judgement judgement = new Judgement(ANSWER);
        //when
        Result result = judgement.Judge(PLAYER1);
        //then
        assertThat(result.strike).isEqualTo(3);
    }
}