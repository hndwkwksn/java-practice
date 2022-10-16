package javarill;

import java.util.Random;

public class ConditionalBranch {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		System.out.println("x = " + x);

		if(x <= 3) {
			System.out.println("xは3以下です。");
		} else if(x <= 5) {
			System.out.println("xは5以下です。");
		} else {
			System.out.println("xは3以下ではありません。");
		}
	}
}
