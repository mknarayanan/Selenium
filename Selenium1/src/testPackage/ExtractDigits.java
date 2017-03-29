package testPackage;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello332w23this logananthan012345test67890";
		String s1 = s.replaceAll("\\D+", "");
		System.out.println("The Digits are: " + s1);
		String s2 = s.replaceAll("[^0-9]", "");
		System.out.println("The Digits are:  "+  s2);
		
	}

}
