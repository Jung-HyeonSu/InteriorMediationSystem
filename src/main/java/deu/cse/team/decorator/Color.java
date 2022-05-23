
package deu.cse.team.decorator;

public abstract class Color {
  String description = "Unknow Color";

  public abstract double cost(); 

  public abstract String ColorValue();

  public String getDescription() {
      return description;
  }

}
