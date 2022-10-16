package javarill;

public class ControlStructure05 {

	public static void main(String[] args) {
		System.out.println("実行結果");

		for(int i = 20; i >= 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i + " 偶数");
			} else {
				System.out.println(i + " 奇数");
			}
		}
	}

}
