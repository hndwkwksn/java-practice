package javarill;

import java.util.Random;

public class Comparison {

	public static void main(String[] args) {
		boolean result;
		Random rand = new Random();
		int x = rand.nextInt(3) + 4;
		System.out.println(x);
		result = (x < 5);
		System.out.println(result);
		result = (x <= 5);
		System.out.println(result);
		result = (x > 5);
		System.out.println(result);
		result = (x >= 5);
		System.out.println(result);
		result = (x == 5);
		System.out.println(result);
		result = (x != 5);
		System.out.println(result);
	}

}
