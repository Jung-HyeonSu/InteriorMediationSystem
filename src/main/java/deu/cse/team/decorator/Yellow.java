
package deu.cse.team.decorator;

import deu.cse.team.source.ColorInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;

class Yellow extends CondimentDecorator {
  private Color color;

  public Yellow(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription() + "\t노란색";
  }

  public int cost() {
      ArrayList<ColorInfo> colorInfo = new ArrayList();
        String money="0";
        int cost=0;
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readColorFileData("C:\\DB\\Color.txt");
            fileMgmt.splitColorFileData();
            colorInfo = fileMgmt.returnColorInfo();
            for (int i = 0; i < colorInfo.size(); i++) {
                if(colorInfo.get(i).getColor().equals("Yellow")){
                    money = colorInfo.get(i).getCost();
                }
            }
        }
        catch (IOException e){
        }
        cost = Integer.parseInt(money) + color.cost();
      return cost;
  }

  public String ColorValue() {
      return "Yellow 색상";
  }

}
