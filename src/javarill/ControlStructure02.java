package javarill;

public class ControlStructure02 {

	public static void main(String[] args) {
		System.out.println("3~5と7~9を表示");
		
		for(int i = 0; i <= 10; i++) {
			if(i >= 3 && i <= 5 || i >= 7 && i <= 9) {
				System.out.println("i = " + i);
			}
		}
	}

}
