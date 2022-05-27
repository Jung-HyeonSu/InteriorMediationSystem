
package deu.cse.team.factory;

public class WarmTileStore extends TileStore {
  @Override
  protected Tile createTile(String item) {
      Tile tile = null;
      final TileFactory tileFactory = (TileFactory)new WarmTileFactory();
      if (item.equals("나무")) {
          tile = (Tile)new WoodTile(tileFactory);
      }
      else if (item.equals("석재")) {
          tile = (Tile)new StoneTile(tileFactory);
      }
      else if (item.equals("대리석")) {
          tile = new MarblesTile(tileFactory);
      }
      return tile;
  }

}
