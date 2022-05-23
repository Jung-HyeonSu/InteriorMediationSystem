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
public class CeilingChangeable implements CeilingBehavior {
    public void CeilingConstruction(){
        System.out.println("천장 구조 변경 가능");
    };
    
    public int CeilingAble(){
        return 1;
    };
}
