package practice;

import java.util.Random;

public class If01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int number =rand.nextInt(15);
		if(number < 5) {
			System.out.println(number + "は5未満です。");
		} else if(number < 10) {
			System.out.println(number + "は10未満です。");
		} else {
			System.out.println(number + "は15未満です。");
		}
	}

}
