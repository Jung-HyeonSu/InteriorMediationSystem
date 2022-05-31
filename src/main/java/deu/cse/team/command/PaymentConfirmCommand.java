/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.command;

/**
 *
 * @author Yool
 */
public class PaymentConfirmCommand implements Command{
    
    PaymentConfirm paymentconfirm;
    
    public PaymentConfirmCommand (PaymentConfirm paymentconfirm){
        this.paymentconfirm = paymentconfirm;
    }
    
    public void execute(){
        
    }
}