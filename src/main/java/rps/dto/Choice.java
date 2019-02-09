package rps.dto;

import java.util.concurrent.ThreadLocalRandom;

public enum Choice {

    ROCK, PAPER, SCISSORS;

    public static Choice randomChoice() {
        return Choice.values()[ThreadLocalRandom.current().nextInt(0, Choice.values().length)];
    }
}
