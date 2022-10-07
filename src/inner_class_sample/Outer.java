package inner_class_sample;

public class Outer {
	private static String greeting = "Hello!";

	public static class Inner {
		public String hello() {
			return greeting;
		}
	}
}
