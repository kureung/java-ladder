package nextstep.ladder.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BarTest {

    @Test
    @DisplayName("사다리의 가로 라인을 생성합니다.")
    void create() {
        Bar bar = new Bar(true);
        assertThat(bar.isActivate()).isTrue();
    }
}