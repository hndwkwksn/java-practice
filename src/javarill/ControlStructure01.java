package javarill;

public class ControlStructure01 {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("0~5を表示(while)");
		while(i <= 5) {
			System.out.println(i);
			i++;
		}

		i = 0;
		System.out.println("0~5を表示(doWhile)");
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);

		System.out.println("0~5を表示(for)");
		for(int j = 0; j <= 5; j++) {
			System.out.println(j);
		}
	}

}
