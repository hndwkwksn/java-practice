package practice;

import java.util.Random;

public class NestedIf {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println(num);

		if(num % 2 == 0) {
			System.out.println("2の倍数です。");
			if(num % 3 == 0) {
				System.out.println("3の倍数でもあります。");
			}
		} else {
			System.out.println("2の倍数ではありません。");
		}

		if((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("2の倍数でしかも3の倍数でもあります。");
		} else {
			System.out.println("それ以外です。");
		}
	}

}
