/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.strategy;

/**
 *
 * @author Yool
 */
public class Apart extends HousingType{
    
    //아파트: 벽o, 천장x, 바닥x, 창문x
    public Apart(){
    WallBehavior = new WallChangeable();
    CeilingBehavior = new CeilingNoChangeable();
    FloorBehavior = new FloorNoChangeable();
    WindowBehavior = new WindowNoChangeable();
    };
    
    public String display() {
        return "Apart";
    };
    
    
}