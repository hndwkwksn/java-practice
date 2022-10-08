package dessert;

public class Desert01 {
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);

		System.out.println(EnumMethod.COOKIE.name());

		EnumMethod orange = EnumMethod.valueOf("ORANGE");
		System.out.println(orange);

		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());

		System.out.println(Dessert.APPLE.getPrice());
		System.out.println(Dessert.ICE_CREAM.getPrice());
		System.out.println(Dessert.CAKE.getPrice());

		Dessert.APPLE.advertise();
		Dessert.ICE_CREAM.advertise();
		Dessert.CAKE.advertise();
	}
}
