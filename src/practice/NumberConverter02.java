package practice;

import java.util.Random;

public class NumberConverter02 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(100);
		int num2 = rand.nextInt(5);
		System.out.print(num1 + "÷" + num2 + "=");

		try {
			int surplus = num1 % num2;
			if(surplus == 0) {
				System.out.println(num1 / num2);
			} else {
				System.out.println(num1 / num2);
				System.out.println("余り:" + surplus);
			}
		} catch(ArithmeticException e) {
			System.out.println("例外発生！");
			System.out.println(num2 + "で割れません！");
		} finally {
			System.out.println("プログラム終了。");
		}
	}

}
