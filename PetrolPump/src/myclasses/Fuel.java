/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.io.Serializable;

/**
 *
 * @author Sadman's Den
 */
public class Fuel extends Storage implements Serializable{
    String fName; 
    float pricePerLiter;

    
    public Fuel(String t , float p , float s){
        fName = t;
        pricePerLiter = p;
        storage = s;
    }

    public String getfName() {
        return fName;
    }
    public void updateStorage(float quantity){
        storage = storage - quantity;
    }

    public float getPricePerLiter() {
        return pricePerLiter;
    }

    public float getStorage() {
        return storage;
    }
    
}
