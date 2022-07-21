
//imported the regular expression packages

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

//class is defined

public class EmailValidation {

//main function is defined

	public static void main(String[] args) {
		{
			ArrayList<String> emails = new ArrayList<String>(); // object is created
			emails.add("crazy@domain.co.in");
			emails.add("crazy@domain.com");
			emails.add("crazy#domaincom");
			emails.add("crazydomain.co.in");
			emails.add("crazy.co.in");
			emails.add("crazy@gmail.com");

			String regex = "^(.+)@(\\S+)$"; // string is defined to match with the input
			Pattern pattern = Pattern.compile(regex);

			for (String email : emails) { // for loop is runs for every string in the array
				Matcher matcher = pattern.matcher(email);
				System.out.println(email + ":" + matcher.matches());
			}
		}
	}

}
