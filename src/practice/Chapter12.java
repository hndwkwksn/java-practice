package practice;

public class Capter12 {

	public static void main(String[] args) {
		NoCapsuleMan man = new NoCapsuleMan("小林", 32);
		System.out.println("名前:" + man.name);
		System.out.println("年齢:" + man.age);
		man.age = 33;
		System.out.println("誕生日を迎えたので、年齢は" + man.age + "です。");
	}

}
