/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javagame;

/**
 *
 * @author it20654580
 */
public class MenInBlackLevel2 extends MenInBlack {
    
    MenInBlackLevel2(AlienPack alienPack){
        super(alienPack);
    }
    
    @Override
    public void kill(){
        for(Alien a : alienPack.getAliens()){
            score += a.getScore();
            
            if((int)(Math.random()*10) % 2 == 1){
                score-=2;
            }
        }        
    }
}
