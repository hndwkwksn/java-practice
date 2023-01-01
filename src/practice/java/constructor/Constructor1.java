package practice.java.constructor;

public class Constructor1 {
	Constructor1() {
		System.out.println("これがコンストラクタ");
	}

	public static void main(String[] args) {
		System .out .println("コンストラクタ呼び出し前");
		new Constructor1();
	}

}
