package javarill;

public class ControlStructure03 {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("0,2,4,,と0から2ずつ10まで表示");

		while(i <= 10) {
			System.out.println("i = " + i);
			i += 2;
		}

		i = 0;
		System.out.println("0~18までの整数で3の倍数を表示");

		do {
			System.out.println("i = " + i);
			i += 3;
		} while(i <= 18);
	}

}
