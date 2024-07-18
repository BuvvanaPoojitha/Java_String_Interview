package StringsPrograms;

import java.util.Scanner;

public class Occurence_particular_Word_String {

	public static void main(String[] args) {
		String a = "Java is a programming language. Java is widely used in software testing";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String ip = input.nextLine();
		String[] arr = a.split(" ");
		int count=0;
		for(int i =0; i<arr.length; i++) {
			String c = arr[i];
			if(ip.equalsIgnoreCase(c)) {
				count++;
			}
		}
		System.out.println(ip+": "+count);
	}

}
