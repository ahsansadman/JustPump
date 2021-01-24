/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.ArrayList;

/**
 *
 * @author Sadman's Den
 */
public class Admin {
    protected int id; String password;
    ArrayList<Employee>employeeList;
    public ArrayList<String>carWashList = new ArrayList();
    
    public void addToCarWashList(String s){
         carWashList.add(s);
         
        }
    public Admin(){};
    
    public Admin (int id, String password){
        this.id = id;
        this.password = password;
    }
    void assingEmployee(){}
    
    void seeSalesInfo(){}
    
    void seeStorageInfo(){}
    
    void order(){}
    
    void employeeDetails(){}
    
    public void display(){
        for(String s: carWashList){
             System.out.println(s);
          }
    }

    public ArrayList<String> getCarWashList() {
        return carWashList;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    
}
