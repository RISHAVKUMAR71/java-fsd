package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class write {
	public static void main(String[] args) {
		
		try {
			FileWriter Writer=new FileWriter("myfilecreated");
			Writer.write("learning java is superb*****");
			Writer.close();
			System.out.println("writing completed");
		}
		catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
