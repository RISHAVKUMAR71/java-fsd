package filehandling;

import java.io.File;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) {
		
		try {
		File sample=new File("myfilecreated");
		if(sample.createNewFile()) {
			System.out.println("file created:"+ sample.getName());
		}
		
		else {
			System.out.println("File exist");
		}
		}
		
	
catch(IOException e) {
		System.out.println("error occured");
		e.printStackTrace();
	}

}
}