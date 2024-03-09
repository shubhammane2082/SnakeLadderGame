package com.java.snakeladder;

public class Player1 
{
	public static void chooseplayer1(int currentPositionPlayer1, int diceNumber1)
	{
		
		if(currentPositionPlayer1 > 100)
		{
			currentPositionPlayer1=currentPositionPlayer1-diceNumber1;
		}
		else if(currentPositionPlayer1 <0)
		{
			currentPositionPlayer1 = 0;
		}
		
	}
}
