package regex_pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^([0-9]{6})");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin code");
		String mypin = sc.next();

		Matcher check = pattern.matcher(mypin);

		if(check.matches()) {
			System.out.println("Given pincode is valid");
		}
		else
		{ 
			System.out.println("Given pincodet is invalid");
		}
	}

}	






