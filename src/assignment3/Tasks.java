package assignment3;

public class Tasks {

	public int countSubstring(String str) {
		
		//exit condition
		if(str.length() < 3)
		return 0;
		
		//count
		if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))
		return 1 + countSubstring(str.substring(2));
		
		//if not string removes first character
		return countSubstring(str.substring(1));
	}
	
	public int count11(String str) {
		
		//exit condition
		if(str.length() < 2)
		return 0;
		
		//count
		if(str.substring(0, 2).equals("11") )
		return 1 + count11(str.substring(2));
		
		//if not string removes first character
		return count11(str.substring(1));
	}
}
