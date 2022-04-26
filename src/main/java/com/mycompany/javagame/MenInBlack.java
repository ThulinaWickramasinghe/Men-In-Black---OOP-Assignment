/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javagame;

/**
 *
 * @author it20654580
 */
public class MenInBlack {
    protected AlienPack alienPack;
    protected int score;
    
    MenInBlack(AlienPack alienPack){
        this.alienPack = alienPack;
        score = 0;
    }
    
    public void setAlienPack(AlienPack alienPack){
        this.alienPack = alienPack;
    }
    
    public AlienPack getAlienPack(){
        return alienPack;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return score;
    }
    
    public void kill(){
        for(Alien a : alienPack.getAliens()){
            score += a.getScore();
        }
    }
}
