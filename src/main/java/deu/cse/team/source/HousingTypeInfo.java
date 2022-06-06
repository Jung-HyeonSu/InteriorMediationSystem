/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.source;

/**
 *
 * @author 915
 */
public class HousingTypeInfo {
    String num;
    String housingtype;
    String walltype;
    String windowtype;
    String floortype;
    String ceilingtype;

    public HousingTypeInfo(String num, String housingtype, String ceilingtype, String floortype, String walltype, String windowtype){
        this.num = num;
        this.housingtype = housingtype;
        this.ceilingtype = ceilingtype;
        this.floortype = floortype;
        this.walltype = walltype;
        this.windowtype = windowtype;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    public String getHousingtype() {
        return housingtype;
    }

    public void setHousingtype(String housingtype) {
        this.housingtype = housingtype;
    }

    public String getWalltype() {
        return walltype;
    }

    public void setWalltype(String walltype) {
        this.walltype = walltype;
    }

    public String getWindowtype() {
        return windowtype;
    }

    public void setWindowtype(String windowtype) {
        this.windowtype = windowtype;
    }

    public String getFloortype() {
        return floortype;
    }

    public void setFloortype(String floortype) {
        this.floortype = floortype;
    }

    public String getCeilingtype() {
        return ceilingtype;
    }

    public void setCeilingtype(String ceilingtype) {
        this.ceilingtype = ceilingtype;
    }
    
    
}
