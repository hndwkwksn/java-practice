package capsule.human;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {

	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanNoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 79;
		System.out.println("名前:" + human1.name + ";年齢:" + human1.age);

		HumanCapsule human2 = new HumanCapsule("小林", 23);
//		human2.name = "三村";
		System.out.println("名前:" + human2.getName() + ";年齢:" + human2.getAge());
		human2.setName("佐々木");
		System.out.println("変更名:" + human2.getName());
	}

}
