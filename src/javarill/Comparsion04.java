package javarill;

import java.util.Random;

public class Comparsion04 {
	public static void main(String[] args) {
		boolean result;
		Random random = new Random();
		int x = random.nextInt(10);
		int j = random.nextInt(10);
		System.out.println("x = " + x);
		System.out.println("j = " + j);

		result = (x < 5) && (j < 10);
		System.out.println(result);

		result = (x > 5) && (j > 5);
		System.out.println(result);

		result = (x > 9) || (j > 3);
		System.out.println(result);

		result = (x > 7) || (j < 3);
		System.out.println(result);

		result = (x == 8) ^ (j == 9);
		System.out.println(result);

		result = (x < 5) ^ (j < 8);
		System.out.println(result);
	}
}
