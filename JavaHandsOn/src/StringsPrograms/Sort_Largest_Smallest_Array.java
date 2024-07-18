package StringsPrograms;

import java.util.Arrays;

public class Sort_Largest_Smallest_Array {

//	public static void main(String[] args) {  //------------largest and smallest number
//		int[] a1 = {5,7,3,21,9,88};
//		int output = 0;
//		int output1 = 0;
//		for(int i =1; i<a1.length; i++) {
//			int a = a1[0];
//			int b = a1[i];
//			if(a<b) {
//				a=b;
//				output=b;
//			}
//		}
//		System.out.println("largest: "+output);
//		for(int i =1; i<a1.length; i++) {
//			int a = a1[0];
//			int b = a1[i];
//			if(a>b) {
//				a=b;
//				output1=a;
//			}
//		}
//		System.out.println("smallest: "+output1);
//	}
	
//	public static void main(String[] args) {  //------------largest and smallest number
//		int[] a= {6,7,8,9,1,2,3,4};
//		Arrays.sort(a);
//		int b = a.length-1;
//		System.out.println("smallest: "+a[0]);
//		System.out.println("largest: "+a[b]);
//	}
	
	public static void main(String[] args) {  //------------Second largest and smallest number
		int[] a= {6,7,8,9,1,2,3,4};
		Arrays.sort(a);
		int b = a.length-2;
		System.out.println("smallest: "+a[1]);
		System.out.println("largest: "+a[b]);
	}
}
