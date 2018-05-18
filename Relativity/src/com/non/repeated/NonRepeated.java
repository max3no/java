/**
 * 
 */
package com.non.repeated;

/**
 * @author Vaibhav.Singh
 *
 */
public class NonRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = new int[]{1, 2, 5, 4, -6, 8, 9, 2, 1, 4, 5, 8, 9};
		int v = 0;
		for(int i = 0;i<arr.length;i++){
			v = v ^ arr[i];
			
		}
		System.out.println(v);
		
		
	}

}
