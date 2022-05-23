
package deu.cse.team.decorator;

class Yellow extends CondimentDecorator {
  private Color color;

  public Yellow(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription() + ", Yellow";
  }

  public double cost() {
      return 1300 + color.cost();
  }

  public String ColorValue() {
      return "Yellow 색상";
  }

}
