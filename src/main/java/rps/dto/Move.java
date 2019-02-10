package rps.dto;

public class Move {
    private Choice choice;

    public Move(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }
}
