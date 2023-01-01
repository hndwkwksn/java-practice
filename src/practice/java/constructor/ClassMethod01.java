package practice.java.constructor;

public class ClassMethod01 {

	public static void main(String[] args) {
		Human01 yamada = new Human01();
		System.out.println("名前：" + yamada.name + ", 年齢：" + yamada.age);

		Human01 tanaka = new Human01("田中", 25);
		System.out.println("名前：" + tanaka.name + ", 年齢：" + tanaka.age);
	}

}
