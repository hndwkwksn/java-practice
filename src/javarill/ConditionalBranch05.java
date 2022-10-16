package javarill;

import java.util.Scanner;

public class ConditionalBranch05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1~10の整数を入力");
		System.out.print("数字入力:");
		int n = stdIn.nextInt();

		switch(n) {
			case 2:
				System.out.println("2は素数です。");
				break;
			case 3:
				System.out.println("3は素数です。");
				break;
			case 5:
				System.out.println("5は素数です。");
				break;
			case 7:
				System.out.println("7は素数です。");
				break;
			default :
				System.out.println("素数ではないです。");
				System.out.println("1~10以外の数字です。");
				break;
		}
	}

}
