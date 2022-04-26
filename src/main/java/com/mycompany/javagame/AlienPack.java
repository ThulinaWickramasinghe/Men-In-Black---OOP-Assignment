/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javagame;

/**
 *
 * @author it20654580
 */
public class AlienPack {
    private Alien[] aliensArray;
    private int num;
    AlienPack(int num){
        this.num = num;
        aliensArray = new Alien[num];
    }
    
    public void addAlien(Alien a, int index){
        aliensArray[index] = a;
    }
    
    public Alien[] getAliens(){
        return aliensArray;
    }
    
}
