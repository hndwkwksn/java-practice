package practice;

public class Cast {

	public static void main(String[] args) {
		byte byteMaxValue = Byte.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;
		int intMaxValue = Integer.MAX_VALUE;

		short shortFromByteValue = byteMaxValue;
		System.out.println("[5] byte -> short = " + byteMaxValue + " -> " + shortFromByteValue);
		float flortFromShortValue = shortMaxValue;
		System.out.println("[7] short -> flort = " + shortMaxValue + " -> " + flortFromShortValue);
		int intFromShortValue = shortMaxValue;
		System.out.println("[9] short -> int = " + shortMaxValue + " -> " + intFromShortValue);
		long longFromIntValue = intMaxValue;
		System.out.println("[11] int -> long = " + intMaxValue + " -> " + longFromIntValue);
		double doubleFromIntValue = intMaxValue;
		System.out.println("[13] doubleFromIntValue = " + intMaxValue + " -> " + doubleFromIntValue);
	}

}
