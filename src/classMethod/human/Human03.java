package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "田中";
		this.age = 24;
		this.profession = "プログラマー";
	}

	public String getProfile() {
		return "年齢:" + this.age + " ; 職業:" + this.profession;
	}

	public void greet(String friend) {
		if(friend == null) {
			System.out.println("挨拶する友達がいません！");
			return;
		}
		System.out.println(friend + "さん、こんにちわ！");
	}
}
