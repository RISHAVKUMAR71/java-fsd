package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		CheckedExceptionDemo obj = new CheckedExceptionDemo();
		obj.readFromFile();

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Desktop\\git-commands.pdf");
		System.out.println( fis);
	}

}