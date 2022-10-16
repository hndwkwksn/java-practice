package javarill;

import java.util.Random;
import java.util.Scanner;

public class Jyanken {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("0~2の整数を入力⇨");
		int yourhand = stdIn.nextInt();
		stdIn.close();

		switch(yourhand) {
			case 0:
				System.out.println("あなたはパー");
				break;
			case 1:
				System.out.println("あなたはチョキ");
				break;
			case 2:
				System.out.println("あなたはグー");
				break;
			default :
				System.out.println("0~2の整数で選んで下さい");
				break;
		}

		Random rand = new Random();
		int computa = rand.nextInt(3);

		switch(computa) {
			case 0:
				System.out.println("パー");
				break;
			case 1:
				System.out.println("チョキ");
				break;
			case 2:
				System.out.println("グー");
				break;
		}

		if(yourhand == 0) {
			if(computa == 0) {
				System.out.println("あいこ");
			} else if(computa == 1) {
				System.out.println("負け");
			} else {
				System.out.println("勝ち");
			}
		} else if(yourhand == 1) {
			if(computa == 0) {
				System.out.println("勝ち");
			} else if(computa == 1) {
				System.out.println("あいこ");
			} else {
				System.out.println("負け");
			}
		} else {
			if(computa == 0) {
				System.out.println("負け");
			} else if(computa == 1) {
				System.out.println("勝ち");
			} else {
				System.out.println("あいこ");
			}
		}
	}

}
