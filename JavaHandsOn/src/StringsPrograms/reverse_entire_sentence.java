package StringsPrograms;

public class reverse_entire_sentence {

	public static void main(String[] args) {
		String a = "India is country my";
		String[] b = a.split(" ");
		String rev = "";
		int c = b.length-1;
		for(int i=c; i>=0; i--) {
			rev = b[i];
			System.out.print(rev+" ");
		}

	}

}
