package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @Test
    @DisplayName("이름은 5자를 초과 할 수 없다")
    void exceedName() {
        assertThatThrownBy(() -> new Name("nameExceed")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("이름은 공백이 될 수 없다")
    void emptyName() {
        assertThatThrownBy(() -> new Name("")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("5이하의 이름을 Wrapping 하는 이름 객체를 만든다")
    void createName() {
        String expect = "abcde";

        Name name = new Name(expect);

        assertThat(name.showName()).isEqualTo(expect);
    }

}