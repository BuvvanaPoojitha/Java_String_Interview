package StringsPrograms;

public class Common_Elements_Array {

	public static void main(String[] args) {
		String[] a = {"sam","jam","kam"};
		String[] b = {"ham","kam","Sam"};
		for(int i =0; i<a.length; i++) {
			String a1 = a[i];
			for(int j =0; j <b.length; j++) {
				String b1 = b[j];
				if(a1.equalsIgnoreCase(b1)) {
					System.out.println(a1);
				}
			}
		}

	}

}
