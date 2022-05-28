
package deu.cse.team.factory;

public class WoodTile extends Tile {
    
    TileFactory tileFactory;
    String texture = "나무";
    
  public WoodTile(TileFactory tileFactory) {
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