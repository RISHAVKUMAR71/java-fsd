
public class typecasting {

	public static void main(String[] args) {
		int y1 = 3;
		byte z1 = 66;

		System.out.println(y1);

//		converting byte to int
		y1 = z1;
		System.out.println(y1);

		int y2 = 30;
		byte z2 = 60;

		System.out.println(z2);

//		converting int to byte
		z2 = (byte) y2;
		System.out.println(z2);

		int y3 = 300;
		long z3 = 600;

		System.out.println(z3);

//		converting int to long
		z3 = (long) y3;
		System.out.println(z3);

//		converting  long to int
		y3 = (int) z3;
		System.out.println(y3);

		String z4 = "123";

		System.out.println(z4);

		// converting string to byte
		Byte y4 = Byte.parseByte(z4);
		System.out.println("after parse=" + y4);

	}

}
