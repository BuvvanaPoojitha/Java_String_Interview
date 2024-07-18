package StringsPrograms;

import java.util.ArrayList;

public class Occurence_Each_Word_String {

	public static void main(String[] args) {
		String a= "Alice is girl and Ram is boy";
		ArrayList<String> s = new ArrayList<>();
		String[] arr = a.split(" ");
		for(int i = 0; i<arr.length; i++) {
			String b = arr[i];
			int count = 1;
			if(!s.contains(b)) {
				for(int j = i+1; j<arr.length; j++) {
					String c = arr[j];
					if(b.equalsIgnoreCase(c)) {
						count++;
						s.add(b);
					}
				}
				System.out.println(b+": "+count);
			}
			
		}
		

	}

}
