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
public class FloorChangeable implements FloorBehavior{
    public void FloorConstruction(){
        System.out.println("바닥 구조 변경 가능");
    };
    
    public String FloorAble(){
        return "가능";
    };
    
}
