/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.command;

/**
 *
 * @author Yool
 */
public class PayConfirmCancelCommand implements Command{
    PaymentConfirm paymentConfirm;
    
    public PayConfirmCancelCommand (PaymentConfirm paymentConfirm){
        this.paymentConfirm = paymentConfirm;
    }
    
    @Override
    public void execute(){
        paymentConfirm.Cancel();
    }
}
