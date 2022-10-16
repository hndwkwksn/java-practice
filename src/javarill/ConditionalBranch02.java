package javarill;

import java.util.Random;

public class ConditionalBranch02 {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		System.out.println(x);

		switch(x) {
			case 3:
				System.out.println("xは3です。");
				break;
			case 4:
				System.out.println("xは4です。");
				break;
			case 5:
				System.out.println("xは5です。");
				break;
			default :
				System.out.println("xは3~5以外です。");
				break;
		}
	}
}
