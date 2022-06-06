
package deu.cse.team.decorator;

import deu.cse.team.source.ColorInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

class Red extends CondimentDecorator {
  private Color color;

  public Red(Color color) {
      this.color = color;
  }

  public String getDescription() {
      return color.getDescription()+ "\t빨간색";
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
                if(colorInfo.get(i).getColor().equals("Red")){
                    money = colorInfo.get(i).getCost();
                }
            }
        }
        catch (IOException e){
        }
        
      return Integer.parseInt(money) + color.cost();
  }

  public String ColorValue() {
      return "Red색상";
  }

}
