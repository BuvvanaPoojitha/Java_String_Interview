package StringsPrograms;

import java.util.ArrayList;

public class Repeated_Characters_String {

	public static void main(String[] args) {
		String a = "poojitha buvvana";
		a=a.replaceAll(" ", "");
		System.out.println(a.length());
		ArrayList<Character> arr = new ArrayList<>();
		for(int i = 0; i<a.length(); i++) {
			char first=a.charAt(i);
			int count = 1;
			if(!arr.contains(first)) {
				for(int j = i+1; j<a.length(); j++) {
					char second=a.charAt(j);
					if(first==second) {
							arr.add(first);
							count++;
					}
				}
				System.out.println(first+":"+count);
			}
		}
	}
}
