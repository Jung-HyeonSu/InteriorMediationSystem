package deu.cse.team.decorator;

public abstract class Color {

    String description = "Unknow Color";

    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
