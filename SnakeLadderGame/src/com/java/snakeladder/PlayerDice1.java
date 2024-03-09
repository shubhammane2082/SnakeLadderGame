package com.java.snakeladder;

import java.util.Random;

public class PlayerDice1 
{
	public static int diceNumber1()
	{
		Random random=new Random();
		return random.nextInt(7);
	}

}
