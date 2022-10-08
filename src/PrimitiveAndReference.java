
public class PrimitiveAndReference {

	public static void main(String[] args) {
		int a = 0;
		int b = a;
		a = 2;
		b = 1;
		System.out.println(a);
		System.out.println(b);

		String str1 = "hello";
		String str2 = str1;
		str1 = "hi";
		str2 = "bye";
		System.out.println(str1);
		System.out.println(str2);

		int[] c = new int[1];
		int[] d = c;
		c[0] = 0;
		d[0] = 2;
		System.out.println(c[0]);
		System.out.println(d[0]);
	}
}
