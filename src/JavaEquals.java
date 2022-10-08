
public class JavaEquals {

	public static void main(String[] args) {
		String hoge = "Hello";
		String fuga = "Hello";
		hoge += "!";
		fuga += "!";

		if(hoge == fuga) {
			System.out.println("hogeとfugaは等しい");
		} else {
			System.out.println("hogeとfugaは違う");
		}

		if(hoge.equals(fuga)) {
			System.out.println("hogeとfugaは等しい");
		} else {
			System.out.println("hogeとfugaは違う");
		}
	}
}
