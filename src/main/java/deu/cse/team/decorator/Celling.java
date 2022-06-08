
package deu.cse.team.decorator;

import deu.cse.team.source.ConstructionInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;

class Celling extends Color {
  public Celling() {
     description = "천장";
  }

  public int cost() {
      ArrayList<ConstructionInfo> constructionInfo = new ArrayList();
        String money="0";
        int cost =0;
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readConstructionFileData("C:\\DB\\ConstructionType.txt");
            fileMgmt.splitConstructionFileData();
            constructionInfo = fileMgmt.returnConstructionInfo();
            for (int i = 0; i < constructionInfo.size(); i++) {
                if(constructionInfo.get(i).getType().equals("천장")){
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
      return "celling";
  }

}
