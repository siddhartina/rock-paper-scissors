package rps.dto;

import java.util.concurrent.ThreadLocalRandom;

public enum Choice {

    ROCK("SCISSORS"), PAPER("ROCK"), SCISSORS("PAPER");

    private String beats;

    Choice(String beats) {
        this.beats = beats;
    }

    public static Choice randomChoice() {
        return Choice.values()[ThreadLocalRandom.current().nextInt(0, Choice.values().length)];
    }

    public boolean beats(Choice choice) {
        return choice.name().equals(beats);
    }
}
