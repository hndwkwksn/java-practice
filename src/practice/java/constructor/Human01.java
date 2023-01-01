package practice.java.constructor;

public class Human01 {
	String name;
	int age;

	Human01() {
		name = "山田";
		age = 20;
	}

	Human01(String str, int i) {
		this.name = str;
		this.age = i;
	}
}
