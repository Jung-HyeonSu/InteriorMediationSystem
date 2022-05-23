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
public class FloorNoChangeable implements FloorBehavior{
    public void FloorConstruction(){
        System.out.println("바닥 구조 변경 불가능");
    };
    
    public String FloorAble(){
        return "불가능";
    };
}
