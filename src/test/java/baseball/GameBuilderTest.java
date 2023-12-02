package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class GameBuilderTest {
    @Test
    @DisplayName("1~9 사이의 서로 다른 수 3개를 생성한다.")
    public void build() throws Exception {
        //given
        GameBuilder game = GameBuilder.build();
        List<Integer> answer = game.getAnswer();
        //when
        int size = answer.stream()
                .filter(number -> number>=1 && number<=9)
                .distinct()
                .toList()
                .size();
        //then
        assertThat(size).isEqualTo(3);
    }
}