package StringsPrograms;

public class Reverse_String {

//	public static void main(String[] args) { -----------reverse string
//		String a = "poojitha";
//		String rev = "";
//		for(int i = 0; i<a.length(); i++) {
//			rev = a.charAt(i)+rev;
//		}
//		System.out.println(rev);
//
//	}
	
//	public static void main(String[] args) { ----------reverse each word in string
//		String b = "poojitha buvvana";
//		String[] a1 = b.split(" ");
//		String a = a1[0];
//		String rev1 = "";
//		for(int i = 0; i<a.length(); i++) {
//			rev1 = a.charAt(i)+rev1;
//		}
////		System.out.println(rev1);
//		String a2 = a1[1];
//		String rev2 = "";
//		for(int i = 0; i<a2.length(); i++) {
//			rev2 = a2.charAt(i)+rev2;
//		}
//		System.out.println(rev1+" "+rev2);
//	}
	
	public static void main(String[] args) { //----------reverse each word in string
		String b = "my name is poojitha";
		String[] a1 = b.split(" ");
		
		for(int i = 0; i<a1.length; i++) {
			String word = a1[i];
			String finaloutput = "";
			String rev2="";
			for(int j = 0; j<word.length(); j++) {
				rev2 = word.charAt(j)+rev2;
				finaloutput = rev2;
			}
			System.out.print(finaloutput+" ");
		}
	}

}
