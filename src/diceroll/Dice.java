/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diceroll;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AS KHAN
 */
public class Dice {
    int dice [];
   static int size;
   int sum;
    Scanner in = new Scanner(System.in);
    boolean taken [];
    int tern;
    public Dice(){
        dice = new int[8];
        taken = new boolean[8];
        for (int i = 0; i < 8; i++) {
            taken[i]=false;
        }
        sum=0;
        size=8;
        tern=0;
    }
    public void rollDice(){
        if(tern==3){
            System.out.println("You have completed Your turns");
            return;
        }
        System.out.println("\tYou Have "+available()+" Dices to Throw: ");
         tern++;
        System.out.print("\nEnter t to throw dices > ");
        char chr = in.next().charAt(0);
       
        if(chr=='t'){
        Random rn = new Random();
        for (int i = 0; i < 8; i++) {
            if(!taken[i]){
            dice[i]=rn.nextInt(6 - 1 + 1) + 1;
                System.out.print(" ["+dice[i]+"],");
            }
        }
            System.out.println("");
        }
        else{
            System.out.println("Invalid Input Try Again!");
            rollDice();
        }
        
           //showAvailable();
                        sort();
                        System.out.print("\nSelect a dice to Set aside > ");
                        int x = in.nextInt();
                        System.out.print("\nThere "+x+"dice that have that number");
                      int y=  takeDices(x);
                      
                         selectDiceNum(x,y);
                         System.out.print("\nScore so far = "+sum);
                         System.out.print("\nEnter f to finish and c to Continue > ");
                          char chrt = in.next().charAt(0);
                     if(chrt=='c')
                          rollDice();
        
    }

   
    public int takeDices(int v){
        int x=0;
         for (int i = 0; i < 8; i++) {
             if(dice[i]==v && !taken[i]){
                 x++;
             }
           }
          
         return x;
    }
    public void selectDiceNum(int v,int x){
        System.out.print("\nYou can choose to keep ");
        for (int i = 0; i < x; i++) {
            System.out.print(" "+(i+1)+",");
        }
        System.out.print(" dice of value "+v+" \n");
        System.out.print("How many do you want to set aside >");
        int z =in.nextInt();
        asside(v,z);
    }
    public int asside(int v,int num){
        int x=num;
        
        sum=0;
        for (int i = 0; i < 8; i++) {
              if(dice[i]==v && !taken[i] && num!=0){
                taken[i]=true;
                sum+=dice[i];
                num--;
              }
        }
        System.out.println("\n You have kept "+available()+" dice so far.");
        return sum;
    }
    public int available(){
        int n=0;
        for (int i = 0; i < 8; i++) {
            if(!taken[i])
                n++;
        }
        return n;
    }
    public void sort(){
        int arr[]=dice;
                        System.out.println("---Sorted---");
       
                Arrays.sort(arr);
                for (int i = 0; i < 8; i++) {
                  
                        if(!taken[i])
                        {
                    System.out.print(" ["+arr[i]+"],");
                 
                        }
                    
                    
                }
                System.out.println("");
    }
    
 
    
}
