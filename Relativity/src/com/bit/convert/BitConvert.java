/**
 * 
 */
package com.bit.convert;

/**
 * @author Vaibhav.Singh
 *
 */
public class BitConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitConvert bit = new BitConvert();
		int count = bit.bitRequired(31,14);
		System.out.println(count);
	}
	
	public int bitRequired(int a, int b){
		int count = 0;
		int c = a^b;
		while(c!=0){
			count += c & 1;
			c = c >> 1;
			
		}
		return count;
	}

}
