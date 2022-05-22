/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.decorator;

/**
 *
 * @author Yool
 */
public class NewMain {

    public static void main(String[] args) {
        
        Color color = new Floor(); 
	color = new Red(color); 
        color = new Orange(color); 
        color = new Yellow(color); 
	System.out.println(color.getDescription() + color.cost() + "원"); 
	}
}
