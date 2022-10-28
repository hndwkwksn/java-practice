package practice;

public class Capsule01 {

	public static void main(String[] args) {
		HumanNoCapsule human01 = new HumanNoCapsule("田中", 28);
		human01.name = "今田";
		human01.age = 70;
		System.out.println("名前:" + human01.name + " 年齢:" + human01.age);

		HumanCapsule human02 = new HumanCapsule("小林", 32);
		System.out.println("名前:" + human02.getName() + " 年齢:" + human02.getAge());
		human02.setName("佐々木");
		System.out.println("変更後の名前:" + human02.getName());
	}

}
