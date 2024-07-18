package StringsPrograms;

import java.util.ArrayList;

public class Occurence_Character_String {

	public static void main(String[] args) {
		String a = "This is an example";
		ArrayList<Character> arr = new ArrayList<Character>();
		a=a.replaceAll(" ", "");
		
		for(int i =0;i<a.length();i++) {
			char b = a.toLowerCase().charAt(i);
			int count = 1;
			if(!arr.contains(b)) {
				for(int j =i+1;j<a.length();j++) {
					char c = a.toLowerCase().charAt(j);
					if(b==c) {
						count++;
						arr.add(b);
					}	
				}
				System.out.println(b+": "+count+"times");
			}
		}
		
	}

}
