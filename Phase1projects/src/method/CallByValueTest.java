package method;

public class CallByValueTest {

	public static void main(String args[]) {
		CallByValue d = new CallByValue();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
	}



