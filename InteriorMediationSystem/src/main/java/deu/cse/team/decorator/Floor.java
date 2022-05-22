
package deu.cse.team.decorator;

class Floor extends Color {
  public Floor() {
    description = "Floor";
  }

  public double cost() {
      return 1100;
  }

  public String ColorValue() {
      return "floor";
  }

}
