
package deu.cse.team.factory;

public abstract class TileStore {
  protected abstract Tile createTile(String item);

  public Tile orderTile(String type) {
      Tile tile = null;
      tile = this.createTile(type);
      tile.prepare();
      return tile;
  }

}
