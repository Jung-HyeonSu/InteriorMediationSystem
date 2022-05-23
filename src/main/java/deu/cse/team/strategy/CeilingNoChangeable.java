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
public class CeilingNoChangeable implements CeilingBehavior {
    public void CeilingConstruction(){
        System.out.println("천장 구조 변경 불가능");
    };
    
    public String CeilingAble(){
        return "불가능";
    };
}
