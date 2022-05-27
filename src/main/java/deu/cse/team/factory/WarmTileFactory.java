
package deu.cse.team.factory;

public class WarmTileFactory implements TileFactory {


  @Override
  public Color createColor() {
      return (Color)new BrownColor();
  }

  @Override
  public Shape createShape() {
      return (Shape)new RectangleShape();
  }

  @Override
  public Design createDesign() {
      return (Design)new DotsDesign();
  }

}
