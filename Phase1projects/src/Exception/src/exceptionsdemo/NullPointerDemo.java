package exceptionsdemo;

public class NullPointerDemo {

	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println("String Length: " + s.length());
		}catch(NullPointerException e){
			
			System.out.println("Nullpointerexception handled");
		}
	System.out.println("gone next...");
	}

}