
package deu.cse.team.factory;

public class MarblesTile extends Tile {
    
    TileFactory tileFactory;
    String texture = "대리석";
    
  public MarblesTile(TileFactory tileFactory) {
      this.tileFactory = tileFactory;
  }

    @Override
  public void prepare() {
      this.color = this.tileFactory.createColor();
      this.shape = this.tileFactory.createShape();
      this.design = this.tileFactory.createDesign();
  }

    @Override
  public String getTexture(){
        return texture;
    }
}
