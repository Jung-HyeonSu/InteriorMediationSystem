/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.command;

/**
 *
 * @author Yool
 */
public class PayTypeCheckCardCommand implements Command{
    PaymentType paymentType;
    
    public PayTypeCheckCardCommand (PaymentType paymentType){
        this.paymentType = paymentType;
    }
    
    @Override
    public String execute(){
        paymentType.CheckCard();
        return "CheckCard";
    }
}

