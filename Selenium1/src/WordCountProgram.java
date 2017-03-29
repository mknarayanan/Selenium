

public class WordCountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Loganathan M 6";
		int wc=0;
				
		for (int i=0; i < str.length(); i++)
		{
			int s = str.length();
			if (str.charAt(i) != s)
			{
				wc = wc + 1;
			}
		
		}
		
		System.out.println("The word count is = " + wc);
		
	}

}
