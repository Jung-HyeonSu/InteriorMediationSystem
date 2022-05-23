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
public class Housing extends HousingType{
    
    //주택: 벽o, 천장o, 바닥o, 창문o
    public Housing(){
    WallBehavior = new WallChangeable();
    CeilingBehavior = new CeilingChangeable();
    FloorBehavior = new FloorChangeable();
    WindowBehavior = new WindowChangeable();
    };

    public void display() {
        System.out.println("선택하신 유형은 주택입니다.");
    };
}
