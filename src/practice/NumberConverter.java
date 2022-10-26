package practice;

public class NumberConverter {
	public static Integer calcNumber(String value) {

		try {
			Integer number = Integer.parseInt(value);
			System.out.println("入力文字:" + number);
			return 10 / number;
		} catch (NumberFormatException e) {
			System.out.println("数字が入力されていません。");
		} catch (ArithmeticException e) {
			System.out.println("0は入力しないで下さい。");
		} finally {
			System.out.println("最終処理です。");
		}

		return null;
	}
}
