package practice;

import java.util.Random;

public class Switch01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int val = rand.nextInt(4);

		switch(val) {
		case 3:
			System.out.println("よく出来ました！");
			break;
		case 2:
			System.out.println("ふつうです。");
			break;
		case 1:
			System.out.println("がんばりましょう、、、");
			break;
		default:
			System.out.println("判定不可");
		}

		int month = rand.nextInt(12);

		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月は'春'です。");
			break;
		case 6:
			System.out.println(month + "月は'梅雨'です。");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println(month + "月は'夏'です。");
			break;
		case 10:
		case 11:
			System.out.println(month + "月は'秋'です。");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月は'冬です。");
			break;
		default:
			System.out.println(month + "月は存在しません。");
		}
	}

}
