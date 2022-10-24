package practice;

public class ClassMethod02 {

	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前:" + yamada.name + "年齢:" + yamada.age);

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前:" + sato.name + "年齢:" + sato.age);
	}

}
