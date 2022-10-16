package javarill;

import java.util.Scanner;

public class ConditionBranch04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("あなたの年齢を入力");
		System.out.print("年齢:");

		int x = stdIn.nextInt();

		if(x >= 18) {
			System.out.println("あなたは成人です。");
		} else {
			System.out.println("あなたは未成年です。");
		}
	}
}
