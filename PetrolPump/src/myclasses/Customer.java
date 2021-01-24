/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Sadman's Den
 */
public class Customer extends Person implements Serializable {
    protected int id;
    protected String password;
    protected Account a = new Account();

    public Customer(){
     
        id =0; password = "TBA" ; a = null;
    }
    
    
    public Customer(int id, String password, String name,  String gender){
        
        this.id = id; this.password = password; this.name = name;   this.gender = gender;
   
    }

    public void setAccount(String accountNo, String accountName, float balance, String cardNo, String nid){
        
        a.accountNo = accountNo;
        a.accountName= accountName;
        a.balance = balance;
        a.cardNo = cardNo;
        a.nidNo = nid;
        
    }
    
    public void buyFuel (Float bill) {
        a.balance = a.balance - bill;
    }
    
    public void payBill(Float bill) {
        a.balance = a.balance - bill;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
    public Account getAccount(){
        return a;
    }
    public void display(){
    
        System.out.println("ID: "+id);
    }
   
}
