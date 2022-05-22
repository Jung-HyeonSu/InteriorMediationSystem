
package deu.cse.team.decorator;

class Orange extends CondimentDecorator {
  private Color color;

  public Orange(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription() + ", Orange";
  }

  public double cost() {
      return 1000 + color.cost();
  }

  public String ColorValue() {
      return "Orange색상";
  }

}
