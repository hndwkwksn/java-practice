package javarill;

import java.util.Scanner;

public class ConditionalBranch03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1~5の数字を入力");
		int n = stdIn.nextInt();

		switch(n) {
			case 2:
				System.out.println("吉");
				break;
			case 3:
				System.out.println("小吉");
				break;
			case 4:
				System.out.println("中吉");
				break;
			case 5:
				System.out.println("大吉");
				break;
			default :
				System.out.println("凶");
		}
	}
}
