package core.programs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		System.out.println ("swapnali@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","swapnali@gmail.com"));
		System.out.println ("virendra@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","virendra@gmail.com"));
		System.out.println ("test123prepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9619116671 : "+Pattern.matches("\\d{10}","9619116671"));
		System.out.println ("Swapnali180wakale45 : "+Pattern.matches("[SWA][a-z]+\\d{3}+[a-z0-9]+","Swapnali180wakale45"));
		
	}

}
