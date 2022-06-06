
package deu.cse.team.decorator;

import deu.cse.team.source.ConstructionInfo;
import deu.cse.team.source.FileMgmt;
import java.io.IOException;
import java.util.ArrayList;

class Floor extends Color {
  public Floor() {
    description = "바닥";
  }

  public int cost() {
      ArrayList<ConstructionInfo> constructionInfo = new ArrayList();
        String money=null;
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readConstructionFileData("C:\\DB\\ConstructionType.txt");
            fileMgmt.splitConstructionFileData();
            constructionInfo = fileMgmt.returnConstructionInfo();
            for (int i = 0; i < constructionInfo.size(); i++) {
                if(constructionInfo.get(i).getType().equals("바닥")){
                    money = constructionInfo.get(i).getCost();
                }
            }
        }
        catch (IOException e){
        }
        
      return Integer.parseInt(money);
  }

  public String ColorValue() {
      return "floor";
  }

}
