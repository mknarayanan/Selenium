package testPackage;

import java.util.regex.Pattern;

public class ExtractSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String thePattern = "[^#@!*()]+";
	String theInput = "^asdfasd2234234234324f#!!@!()*&%$W^";
	String s2 = theInput.replaceAll("[^^#@!*()*&%$0-9]", "");
	boolean isFound = Pattern.compile(thePattern).matcher(theInput).find();
	System.out.println("Found : " + isFound);
	System.out.println("The Output is : "+ s2);
			
	}

}
