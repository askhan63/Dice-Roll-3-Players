/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diceroll;

/**
 *
 * @author AS KHAN
 */
public class Players extends Rounds {
    String[] player;
    Dice dice;
    int[] score;
    public Players(){
        super();
        player=new String[3];
        for (int i = 0; i < 3; i++) {
            player[i]="Player "+(i+1);
        }
        dice = new Dice();
        score =new int[3];
    }

    public String[] getPlayer() {
        return player;
    }

    public Dice getDice() {
        return dice;
    }

    public int[] getScore() {
        return score;
    }
    
    
    
    
}


/*



static int player1Total = 0;
	static int player2Total = 0;
	static int winner = 0;	//0 = no winner yet;  1 = player 1 wins; 2 = player 2 wins
	static int round = 1; //record the play round;
	public static void main(String [] args)
	{		
		while (winner == 0)
		{
			System.out.println("\n------------This is round "+round+"-------------");
			round++;			
			rollDice1();			
			rollDice2();
		}
	}		
	public static void rollDice1()
	{
		if (winner == 0)
		{
			int num1=0;
			int num2=0;	
			do
			{
				num1 = (int) (Math.random() * 6)+1;
				num2 = (int) (Math.random() * 6)+1;
				System.out.println("Player 1 rolls a "+num1+" and a "+num2);	
				player1Total = player1Total+num1+num2;
				System.out.println("Player 1 now has "+player1Total);
				if (num1==num2&&player1Total<75)
				{
					System.out.println("Player 1 gets to roll again");
				}				
			}
			while(num1==num2&&player1Total<75);
			if (player1Total>=75)
			{
				winner = 1;
				System.out.println("Player 1 wins with a total of "+player1Total);
				System.out.println("\nFinal score is \nplayer 1: "+player1Total+"\nplayer 2: "+player2Total);
			}
		}		
	}
	

	public static void rollDice2()
	{
		if (winner == 0)
		{			
			int num1 = (int) (Math.random() * 6)+1;			
			int num2 = (int) (Math.random() * 6)+1;
			System.out.println("Player 2 rolls a "+num1+" and a "+num2);			
			player2Total = player2Total+num1+num2;
			System.out.println("Player 2 now has "+player2Total);
			if (player2Total <75)
			{
				if(num1==num2)
				{
					System.out.println("Player 2 gets to roll again");
					rollDice2();//recall		
				}
			}
			else
			{
				winner = 2;
				System.out.println("Player 2 wins with a total of "+player2Total);
				System.out.println("\nFinal score is \nplayer 1: "+player1Total+"\nplayer 2: "+player2Total);
			}
		}
	}
}
*/