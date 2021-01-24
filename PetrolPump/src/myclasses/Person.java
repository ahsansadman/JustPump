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
public class Person implements Serializable {
    public String name, dob, gender;
    
    Person(){
        name="TBA"; dob="00/00/0000"; gender="TBA";
    }
}
