package rps.dto;

public class ComputersChoiceDto {
    private Choice choice;

    public ComputersChoiceDto(Choice choice) {
        this.choice = choice;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }
}
