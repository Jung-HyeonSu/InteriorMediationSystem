/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.command;

/**
 *
 * @author Yool
 */
public class PaymentTypeCommand implements Command{
    
    PaymentType paymenttype;
    
    
    public PaymentTypeCommand (PaymentType paymenttype){
        this.paymenttype = paymenttype;
    }
    
    public void execute(){
        
    }
    
}
