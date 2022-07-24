
package filehandling;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class readfile {
	public static void main(String[] args) {

		try {
			File sample = new File("myfilecreated");
			Scanner Reader=new Scanner(sample);
			while(Reader.hasNextLine()) {
				String data=Reader.nextLine();
				System.out.println(data);
				
			}
			Reader.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}

	}
}