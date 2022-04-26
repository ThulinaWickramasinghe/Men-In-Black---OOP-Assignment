/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javagame;

/**
 *
 * @author it20654580
 */
public class JavaGame {

    public static void main(String[] args) {
        AlienPack pack1 = new AlienPack(5);
        pack1.addAlien(new MarshmalloAlien(),0);
        pack1.addAlien(new OgreAlien(), 1);
        pack1.addAlien(new OgreAlien(), 2);
        pack1.addAlien(new SnakeAlien(), 3);
        pack1.addAlien(new MarshmalloAlien(), 4);

        MenInBlack AgentK = new MenInBlack(pack1);
        AgentK.kill();
        System.out.println("Your score is " + AgentK.getScore());
    }
}
