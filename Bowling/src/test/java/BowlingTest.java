import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BowlingTest {

    @Test
    public void
    it_should_return_zero_for_missed_pins() {
        assertThat(Bowling.play("--|--|--|--|--|--|--|--|--|--|")).isEqualTo(0);
    }

    @Test
    public void
    it_should_return_a_number_when_some_balls_are_not_missed() {
        assertThat(Bowling.play("--|--|--|--|12|--|--|2-|--|--|")).isEqualTo(5);
    }

    @Test
    public void
    it_should_return_a_number_when_we_have_a_spare_with_misses_after_it() {
        assertThat(Bowling.play("--|--|--|--|--|--|--|2/|--|--|")).isEqualTo(10);
    }

    @Ignore
    @Test
    public void acceptance_test() {
        assertThat(Bowling.play("X|X|X|X|X|X|X|X|X|X||XX")).isEqualTo(300);
        assertThat(Bowling.play("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||")).isEqualTo(90);
        assertThat(Bowling.play("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5")).isEqualTo(150);
        assertThat(Bowling.play("X|7/|9-|X|-8|8/|-6|X|X|X||81")).isEqualTo(167);
    }
}