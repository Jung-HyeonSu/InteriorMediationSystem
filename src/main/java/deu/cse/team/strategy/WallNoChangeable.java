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
public class WallNoChangeable implements WallBehavior{
    public void WallConstruction(){
        System.out.println("벽 구조 변경 불가능");
    };
    
    public int WallAble(){
        return 2;
    }
}
