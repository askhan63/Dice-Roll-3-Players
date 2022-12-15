/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package diceroll;

/**
 *
 * @author AS KHAN
 */
public abstract class Rounds {
   private int round;
   public Rounds(){
       round=0;
   }

    public int getRound() {
        return round;
    }

    public void setRound() {
        this.round++;
    }
    
   
}
