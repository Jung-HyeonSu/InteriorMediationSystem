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
public class Villa extends HousingType{
    
    //빌라: 벽o, 천장o, 바닥o, 창문x
    public Villa(){
    WallBehavior = new WallChangeable();
    CeilingBehavior = new CeilingChangeable();
    FloorBehavior = new FloorChangeable();
    WindowBehavior = new WindowNoChangeable();
    };
    
    public void display(){
        System.out.println("선택하신 유형은 빌라입니다.");
    };
    
}
