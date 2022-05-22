
package deu.cse.team.decorator;

class Wall extends Color {
  public Wall() {
      description = "Wall";
  }

  public double cost() {
      return 1200;
  }

  public String ColorValue() {
      return "Wall";
  }

}
