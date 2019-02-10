package rps.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import rps.dto.Choice;
import rps.dto.Result;
import rps.service.RpsService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {RpsServiceImpl.class})
public class RpsServiceImplTest {
    @Autowired
    private RpsService rpsService;

    @Test
    public void testComputeResult() {
        assertThat(rpsService.computeResult(Choice.ROCK, Choice.ROCK), is(Result.TIE));
        assertThat(rpsService.computeResult(Choice.ROCK, Choice.PAPER), is(Result.COMPUTER_WINS));
        assertThat(rpsService.computeResult(Choice.ROCK, Choice.SCISSORS), is(Result.HUMAN_WINS));
        assertThat(rpsService.computeResult(Choice.PAPER, Choice.ROCK), is(Result.HUMAN_WINS));
        assertThat(rpsService.computeResult(Choice.PAPER, Choice.PAPER), is(Result.TIE));
        assertThat(rpsService.computeResult(Choice.PAPER, Choice.SCISSORS), is(Result.COMPUTER_WINS));
        assertThat(rpsService.computeResult(Choice.SCISSORS, Choice.ROCK), is(Result.COMPUTER_WINS));
        assertThat(rpsService.computeResult(Choice.SCISSORS, Choice.PAPER), is(Result.HUMAN_WINS));
        assertThat(rpsService.computeResult(Choice.SCISSORS, Choice.SCISSORS), is(Result.TIE));
    }
}
