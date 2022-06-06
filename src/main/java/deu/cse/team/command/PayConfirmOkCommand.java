/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.command;

/**
 *
 * @author Yool
 */
public class PayConfirmOkCommand implements Command{
    
    PaymentConfirm paymentConfirm;
    
    public PayConfirmOkCommand (PaymentConfirm paymentConfirm){
        this.paymentConfirm = paymentConfirm;
    }
    
    @Override
    public String execute(){
        paymentConfirm.Ok();
        return "ok";
    }
}