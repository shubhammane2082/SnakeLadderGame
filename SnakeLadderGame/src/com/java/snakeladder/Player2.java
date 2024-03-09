package com.java.snakeladder;

public class Player2 
{
	public static void chooseplayer2(int currentPositionPlayer2, int diceNumber2)
	{
		
		if(currentPositionPlayer2 > 100)
		{
			currentPositionPlayer2=currentPositionPlayer2-diceNumber2;
		}
		else if(currentPositionPlayer2 <0)
		{
			currentPositionPlayer2 = 0;
		}
		
	}
}
