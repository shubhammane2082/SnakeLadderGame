package com.java.snakeladder;

public class SnakeLadderMain 
{
	static int initialPositionplayer1=0,currentPositionPlayer1=0, initialPositionplayer2=0,currentPositionPlayer2=0;
	static int diceNumber1=0,diceNumber2=0;
	static int option1=0,option2=0;
	static final int goal=100;
	static int count=0;
	public static void main(String[] args) 
	{
		while(currentPositionPlayer1 < goal && currentPositionPlayer2 < goal)
		{
			diceNumber1=PlayerDice1.diceNumber1();
			diceNumber2=Player2Dice2.diceNumber2();
			
			option1=Checkoption1.checkoption1();
			option2=Checkoption2.checkoption2();
			
			count++;
			switch(option1)
			{
			   case 0 :
//				 System.out.println("No Play...");
				 break;
			   case 1 :
				 currentPositionPlayer1 += diceNumber1;
				 break;
			   case 2: 
				currentPositionPlayer1 -= diceNumber1;
				break;
			}
			Player1.chooseplayer1(currentPositionPlayer1, diceNumber1);
			
			switch(option2)
			{
			   case 0 :
//				 System.out.println("No Play...");
				 break;
			   case 1 :
				 currentPositionPlayer2 += diceNumber2;
				 continue;
			   case 2: 
				currentPositionPlayer2 -= diceNumber2;
				break;
			}
			Player2.chooseplayer2(currentPositionPlayer2, diceNumber2);			
//			System.out.println("Current Position of Player 1 is : "+currentPositionPlayer1);
//			System.out.println("Current Position of Player 2 is : "+currentPositionPlayer2);
		}
		System.out.println("No. of Times Dice Roll is : "+count);
		Result.result(currentPositionPlayer1);
	}

}
