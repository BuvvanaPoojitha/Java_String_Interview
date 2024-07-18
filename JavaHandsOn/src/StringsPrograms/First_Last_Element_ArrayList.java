package StringsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class First_Last_Element_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(a.get(0));
		System.out.println(a.get(a.size()-1));
	}

}
