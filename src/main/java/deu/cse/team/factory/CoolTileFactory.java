
package deu.cse.team.factory;

public class CoolTileFactory implements TileFactory {

  @Override
  public Color createColor() {
      return (Color)new SkyColor();
  }

  @Override
  public Shape createShape() {
      return (Shape)new HexagonShape();
  }

  @Override
  public Design createDesign() {
      return (Design)new StripeDesign();
  }

}
