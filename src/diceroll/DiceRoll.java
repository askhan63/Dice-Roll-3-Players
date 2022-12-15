/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diceroll;

import java.util.Scanner;

/**
 *
 * @author AS KHAN
 */
public class DiceRoll {
static int player1Total = 0;
	static int player2Total = 0;	
        static int player3Total = 0;
 static  int score1[]= new int[3];
            static  int score2[]= new int[3];
            static    int score3[]= new int[3];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int round = 3;
         Dice d1=new Dice();
         Dice d2=new Dice();
           Dice d3=new Dice();
         
        Scanner in = new Scanner(System.in);
        int i=0;
    while (round !=0)
		{
			System.out.println("\n------------This is round "+(i+1)+"-------------");
			
                        System.out.println("-----Player 1 Turn-----");
			d1.rollDice();
                        score1[i]=d1.sum;
                               
                        player1Total+=d1.sum;
                     System.out.println("Player 1 Score : "+d1.sum);
                     
                     System.out.println("-----Player 2 Turn-----");
                     d2.rollDice();
                      score2[i]=d2.sum;
                     player2Total+=d2.sum;
                     System.out.println("Player 2 Score : "+d2.sum);
                   
                     System.out.println("-----Player 3 Turn-----");
                     d3.rollDice();
                      score3[i]=d3.sum;
                     player3Total+=d3.sum;
                     System.out.println("Player 3 Score : "+d3.sum);
                     print(d1,d2,d3);
                      i++;
                     round--;
		}
    if(player1Total>player2Total && player1Total>player3Total)
            System.out.println("Player 1 has won "+player1Total);
    else if(player2Total>player1Total && player2Total>player3Total)
            System.out.println("Player 2 has won "+player2Total);
     else if(player3Total>player2Total && player3Total>player1Total)
            System.out.println("Player 3 has won "+player3Total);
    
    }
    
    public static void print( Dice d1, Dice d2, Dice d3){
        System.out.println("-------------------------------------------------------------");
        System.out.println("|\tRound |\tPlayer 1 |\tPlayer 2 |\tPlayer 3 |");
        System.out.println("-------------------------------------------------------------");
        System.out.println("|\t 1 |\t\t"+score1[0]+" |\t\t"+score2[0]+" |\t\t"+score3[0]+" |");
        System.out.println("|\t 2 |\t\t"+score1[1]+" |\t\t"+score2[1]+" |\t\t"+score3[1]+" |");
        System.out.println("|\t 3 |\t\t"+score1[2]+" |\t\t"+score2[2]+" |\t\t"+score3[2]+" |");
        System.out.println("|\t Total |\t"+player1Total+" |\t\t"+player2Total+" |\t\t"+player3Total+" |");
         System.out.println("-------------------------------------------------------------");

  
    }
    
}
