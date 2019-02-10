package rps.dto;

public class Move {
    private Choice computersChoice;
    private Result result;

    public Move(Choice choice, Result result) {
        this.computersChoice = choice;
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public Choice getComputersChoice() {
        return computersChoice;
    }
}
