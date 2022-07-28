package exceptionsdemo;

public class StringParser {

	public static void main(String[] args) {
		try {
		String s = "abc";
		int a = Integer.parseInt(s);
		System.out.println("Result: " + a);
		} catch (Exception e) {
			System.out.println(" error occurred");
		}
		System.out.println("Other Programming logic continues below...");
		
	}

}