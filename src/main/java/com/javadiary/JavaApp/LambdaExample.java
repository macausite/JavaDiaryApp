package com.javadiary.JavaApp;

import java.util.ArrayList;
import java.util.Random;

public class LambdaExample {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rnd=new Random();
		int upperbound=100;
		int int_random=rnd.nextInt(upperbound);
		for (int i=0; i<50;i++)
		{
		numbers.add(int_random);
		}
		numbers.forEach((n) -> {
			System.out.println(n);
		});
	}
}
