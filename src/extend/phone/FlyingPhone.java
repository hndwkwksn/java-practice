package extend.phone;

public class FlyingPhone implements Phone {
	private String number;
	protected int fly;

	public FlyingPhone(int fly) {
		this.fly = fly;
	}

	public void fly() {
		System.out.println(this.fly + "分間、飛びます。");
	}

	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
}
