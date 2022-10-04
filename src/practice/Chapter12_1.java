package practice;

public class Chapter12_1 {
	public static void main(String[] args) {
		CapsuleMan man = new CapsuleMan("小林", 32);
		System.out.println("名前:" + man.getName());
		System.out.println("年齢:" + man.getAge());
		man.setAge(33);
		System.out.println("誕生日⇨" + man.getAge());
	}
}
