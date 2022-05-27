
package deu.cse.team.factory;

public class ModernTileFactory implements TileFactory {

  @Override
  public Color createColor() {
      return (Color)new WhiteColor();
  }

  @Override
  public Shape createShape() {
      return (Shape)new SquareShape();
  }

  @Override
  public Design createDesign() {
      return (Design)new NaturalDesign();
  }

}
