package rps.dto;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ChoiceTest {
    @Test
    public void shouldBeat() {
       assertThat(Choice.ROCK.beats(Choice.ROCK), is(false));
       assertThat(Choice.ROCK.beats(Choice.PAPER), is(false));
       assertThat(Choice.ROCK.beats(Choice.SCISSORS), is(true));
       assertThat(Choice.PAPER.beats(Choice.ROCK), is(true));
       assertThat(Choice.PAPER.beats(Choice.PAPER), is(false));
       assertThat(Choice.PAPER.beats(Choice.SCISSORS), is(false));
       assertThat(Choice.PAPER.beats(Choice.ROCK), is(true));
       assertThat(Choice.PAPER.beats(Choice.PAPER), is(false));
       assertThat(Choice.PAPER.beats(Choice.SCISSORS), is(false));
    }
}
