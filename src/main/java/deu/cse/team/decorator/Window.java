
package deu.cse.team.decorator;

import deu.cse.team.source.ConstructionInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;

class Window extends Color {
  public Window() {
            description = "창문";
  }

  public int cost() {
      ArrayList<ConstructionInfo> constructionInfo = new ArrayList();
        String money="0";
        int cost=0;
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readConstructionFileData("C:\\DB\\ConstructionType.txt");
            fileMgmt.splitConstructionFileData();
            constructionInfo = fileMgmt.returnConstructionInfo();
            for (int i = 0; i < constructionInfo.size(); i++) {
                if(constructionInfo.get(i).getType().equals("창문")){
                    money = constructionInfo.get(i).getCost();
                }
            }
        }
        catch (IOException e){
        }
        cost = Integer.parseInt(money);
      return cost;
  }

  public String ColorValue() {
      return "window";
  }

}
