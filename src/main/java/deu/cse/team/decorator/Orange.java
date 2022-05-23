
package deu.cse.team.decorator;

import deu.cse.team.source.ColorInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;

class Orange extends CondimentDecorator {
  private Color color;

  public Orange(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription() + ", Orange";
  }

  public int cost() {
      ArrayList<ColorInfo> colorInfo = new ArrayList();
        String money=null;
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readColorFileData("C:\\DB\\Color.txt");
            fileMgmt.splitColorFileData();
            colorInfo = fileMgmt.returnColorInfo();
            for (int i = 0; i < colorInfo.size(); i++) {
                if(colorInfo.get(i).getColor().equals("Orange")){
                    money = colorInfo.get(i).getCost();
                }
            }
        }
        catch (IOException e){
        }
        
      return Integer.parseInt(money) + color.cost();
  }

  public String ColorValue() {
      return "Orange색상";
  }

}
