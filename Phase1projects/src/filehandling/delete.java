package filehandling;

import java.io.File;

public class delete {
		public static void main(String[] args) {
			File sample= new File("myfilecreated");
			
			if(sample.delete()) {
				System.out.println("file deleted:"+ sample.getName());
			}
			else
			System.out.println("not deleted");
			
		}
}
