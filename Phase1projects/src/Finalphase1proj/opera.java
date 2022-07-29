package Finalphase1proj;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.*;

public class opera {

	public void LAF(String path) {

		File directory = new File(path);

		String[] files = directory.list();

			Set<String> filesList = new TreeSet<String>(Arrays.asList(files));
			System.out.println("All Files in location: " + directory.getAbsolutePath() + " are: \n");
			for (String file1 : filesList) {

				System.out.println(file1);

			}
		}

	public void createNewFile(String path, String fileName) throws IOException {


		File newFile = new File(path + File.separator + fileName);

		boolean createFile = newFile.createNewFile();

		if (createFile) {

			System.out.println("\nFile successfully created at location: " + newFile.getAbsolutePath());

		} else if (!createFile) {

			System.out.println("\nFile Already Exist.. Please try again.");

		}

	}

	public void deleteFile(String path, String fileName) throws IOException {
		File directory = new File(path);
		File newFile = new File(path + File.separator + fileName);

		boolean deleteFile = newFile.delete();

		if (deleteFile) {

			System.out.println("\nFile deleted Successfully from location:"+ directory.getAbsolutePath());

		} else {

			System.out.println("\nFile not found...");
		}
	}

	public void searchFile(String path, String fileName) {

		File directory = new File(path);
		String[] fileList = directory.list();
		boolean flag = false;

		Pattern pat = Pattern.compile(fileName);
			for (String file : fileList) {
				Matcher mat = pat.matcher(file);
				if (mat.matches()) {
					System.out.println("File Found at location: " + directory.getAbsolutePath());
					flag = true;
					break;
				}
			}

		if (flag == false)
			System.out.println("File Not Found.. Please try again.");

	}

}
