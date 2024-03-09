package com.java.snakeladder;

public class SnakeLadderMain 
{
	static int initialPositionplayer1=0,currentPositionPlayer1=0;
	static int diceNumber1=0;
	static int option1=0;
	static final int goal=100;
	public static void main(String[] args) 
	{
		while(currentPositionPlayer1 < goal)
		{
			diceNumber1=PlayerDice1.diceNumber1();
			
			option1=Checkoption1.checkoption1();
			
			switch(option1)
			{
			   case 0 :
				 System.out.println("No Play...");
				 break;
			   case 1 :
				 currentPositionPlayer1 += diceNumber1;
				 break;
			   case 2: 
				currentPositionPlayer1 -= diceNumber1;
				break;
			}
			Player1.chooseplayer1(currentPositionPlayer1, diceNumber1);
			
			
			System.out.println("Current Position of player is : "+currentPositionPlayer1);
		}
	}

}
