
package deu.cse.team.decorator;

class Red extends CondimentDecorator {
  private Color color;

  public Red(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription() + ", Red";
  }

  public double cost() {
      return 1200 + color.cost();
  }

  public String ColorValue() {
      return "Red색상";
  }

}
